package controllers;

import static controllers.UserController.showRegister;
import static play.data.Form.form;

import java.util.List;

import controllers.Models.User;
import controllers.Models.Carona;
import play.mvc.Controller;
import play.data.Form;
import play.mvc.Result;
import DBManager.*;
import controllers.Models.*;
import LogFile.*;


public class UserController extends Controller{

    private static Form<User> loginForm = form(User.class).bindFromRequest();
    private static DBManager db = null;
    private static User actualUser;

    public static Result showLogin(String mensagem, boolean erro) {
        return ok(views.html.login.render(loginForm, mensagem, erro));
    }

    public static Result showLogin() {
        return showLogin("", false);
    }

    public static Result showPerfil(){
        User user = getUser();

        if (user.getIsDriver())
        {
            return ok(views.html.perfilDriver.render(user));
        }
        return ok(views.html.perfilPassenger.render());


    }

    public static Result authenticate() {
        if(db == null){
            try{
                db = new DBManager();
            }
            catch (Exception e){}
        }

        Form<User> form = form(User.class).bindFromRequest();

        String email = form.field("email").value();
        String senha = form.field("password").value();

        if (email == null || senha == null) {
            LogFile.writeInLog("An user try to loggin, but an error ocurred.");
            return showLogin("An error ocurred. Please, try again.", true);
        } else if (!Validate.validateLogin(email, senha, db)) {
            LogFile.writeInLog("An user try to loggin, but the email or password is invalid.");
            return showLogin("E-mail or password invalid", true);
        } else {
            User user = db.searchUserByEmail(email);
            LogFile.writeInLog(user.getName() + " user logged.");
            actualUser = user;
            session().clear();
            session("email", user.getEmail());
            //aqui nao será perfil.. sera a US2 e US7
            return showPerfil();
        }
    }

    public static Result selectSolicitation(){
        Form<Carona> form = form(Carona.class).bindFromRequest();
        int indice = form.field("linha");

        //return ok(views.html.perfilPassenger.render());
    }

    public static User getUser() {

        return actualUser;
    }

    public static boolean isRegisteredEmail(String email)
    {
        return db.searchUserByEmail(email) != null;
    }

    public static Result showRegister(String mensagem) {
        return ok(views.html.register.render(loginForm, mensagem));
    }

    public static Result showRegister() {
        return showRegister("");
    }

    private static boolean isRegistrationValid(String registration)
    {
        if(registration.trim().equals(""))
        {
            return false;
        }

        int intRegistration = Integer.parseInt(registration);

        return (!registration.trim().equals("")) && (registration.length() == 9) && (intRegistration > 100000000 && intRegistration < 115199999);
    }

    

    public static Result register(){

        if(db == null) {
            try {
                db = new DBManager();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Form<User> form = loginForm.bindFromRequest();

        String name = form.field("name").value();
        String registration = form.field("registration").value();
        String phoneNumber = form.field("phone-number").value();
        String email = form.field("email").value();
        String password = form.field("password").value();
        String newPassword = form.field("new-password").value();
        String driver = form.field("isDriver").value();
        String passenger = form.field("isPassenger").value();
        String numberPassenges = form.field("numberPassenges").value();
        String district = form.field("district").value();
        String road = form.field("road").value();


        boolean isDriver = false;

        if (name == null || email == null || password == null ||registration == null || district == null
                || road == null) {
            return showRegister("An error ocurred. Please, try again.");

        } else if(name.trim().equals("")){
            LogFile.writeInLog("An user try to register, but the name is invalid.");
            return showRegister("Invalid name");

        } else if(!isRegistrationValid(registration)) {
            LogFile.writeInLog("An user try to register, but the resgistration is invalid.");
            return showRegister("Invalid Registration");

        } else if (db.searchUserByRegistration(registration) != null) {
            LogFile.writeInLog("An user try to register, but the registration aready registered.");
            return showRegister("Registration aready registered");

        } else if(email.trim().equals("")) {
            LogFile.writeInLog("An user try to register, but the email is invalid.");
            return showRegister("Invalid Email");

        } else if (isRegisteredEmail(email)) {
            LogFile.writeInLog("An user try to register, but the email already registered.");
            return showRegister("E-mail already registered");

        } else if (password.trim().equals("")) {
            LogFile.writeInLog("An user try to register, but the password is invalid.");
            return showRegister("Invalid Password");

        } else if(!password.equals(newPassword)) {
            LogFile.writeInLog("An user try to register, but the passwords don't match.");
            return showRegister("The passwords don't match");

        }else if (district.trim().equals("")){
            LogFile.writeInLog("An user try to register, but the district is invalid.");
            return showRegister("Invalid District");

        }else if(road.trim().equals("")) {
            LogFile.writeInLog("An user try to register, but the road is invalid.");
            return showRegister("Invalid Road");

        } else if(driver != null) {
            if(numberPassenges == null || numberPassenges.trim().equals("")) {
                LogFile.writeInLog("An user try to register, but it is a driver and don't put the number os passenger.");
                return showRegister("If you are a driver, put the number of passenger");
            }
            else if(Integer.parseInt(numberPassenges) <= 0){
                LogFile.writeInLog("An user try to register, but it is a driver and the number of passenger is zero or negative.");
                return showRegister("Please, put the number of passenger greater than zero");
            }
            isDriver = true;
        }

        User user = null;
        try {
            if(isDriver) {
                user = new User(name, registration, email, password, isDriver, district, road, Integer.parseInt(numberPassenges));
            }
            else{
                user = new User(name, registration, email, password, isDriver, district, road);
            }
            LogFile.writeInLog(user.getName() + " user registred.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        if(user != null) {
            db.writeInDataBase(user);
        }


        return showLogin("User successfully registered", false);

    }

    public static Result logout() {
        session().clear();
        LogFile.writeInLog("The user logout.");
        return showLogin("Deslogado com sucesso", false);
    }

}
