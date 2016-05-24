package controllers;

import static controllers.UserController.showRegister;
import static play.data.Form.form;

import java.util.List;

import Models.Solicitations;
import controllers.Models.User;
import controllers.Models.Carona;
import play.mvc.Controller;
import play.data.Form;
import play.mvc.Result;
import DBManager.*;
import controllers.Models.*;
import LogFile.*;


public class UserController extends Controller{

    private static Form<User> formUser = form(User.class).bindFromRequest();
    private static DBManager db = DBManager.getInstance();
    private static User actualUser;
    private static boolean actualPerfilIsDriver = false;
    private static LocalizedStrings strings;
    static {
        String language = session("language");
        if (language == null) {
            strings = LocalizedStrings.getInstance("EN"); //default
        } else {
            strings = LocalizedStrings.getInstance(language);
        }
    }

    public static Result showLogin(String mensagem, boolean erro) {
        return ok(views.html.login.render(formUser, mensagem, erro, strings));
    }

    public static Result showLogin() {
        return showLogin("", false);
    }

    public static Result showTeste(){
        return TODO;//views.html.perfilPassenger.render());
    }

    public static Result showPerfil(){
        User user = getUser();
        if (actualPerfilIsDriver)
        {
            return ok(views.html.perfilDriver.render(user, formUser, strings));
        }
        return ok(views.html.perfilPassenger.render(user, formUser,strings));


    }

    public static Result authenticate() {
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
            session().clear();
            session("email", user.getEmail());
            user.setAvaliableCaronas(db.driversPassingByUserStart(user));
            actualUser = user;
            return showPerfil();
        }
    }

    public static User getUser() {
        return actualUser;
    }

    public static boolean isRegisteredEmail(String email) {

        return db.searchUserByEmail(email) != null;
    }

    public static Result showRegister(String mensagem) {
        return ok(views.html.register.render(formUser, mensagem, strings));
    }

    public static Result showRegister() {
        return showRegister("");
    }

    private static boolean isRegistrationValid(String registration) {
        if(registration.trim().equals(""))
        {
            return false;
        }

        int intRegistration = Integer.parseInt(registration);

        return (!registration.trim().equals("")) && (registration.length() == 9) && (intRegistration > 100000000 && intRegistration < 115199999);
    }

    public static Result register(){

        Form<User> form = formUser.bindFromRequest();

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
            return showRegister("Invalid Neighborhood");

        }else if(road.trim().equals("")) {
            LogFile.writeInLog("An user try to register, but the road is invalid.");
            return showRegister("Invalid Street Address");

        }else if(phoneNumber == null || phoneNumber.trim().equals("")){
            LogFile.writeInLog("An user try to register, but the number phone is invalid.");
            return showRegister("Invalid phone number");
        } else if(driver != null && passenger == null) {
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
                user = new User(name, registration, email, password, isDriver, district, road,phoneNumber, Integer.parseInt(numberPassenges));
            }
            else{
                user = new User(name, registration, email, password, isDriver, district, road, phoneNumber);
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
        return showLogin("Sucess logout", false);
    }

    public static Result showUpdateData(String mensagem){ /// aqui
        return ok(views.html.updateData.render(formUser, mensagem));

    }

    public static Result showUpdateData() { // aqui
        return showUpdateData("");
    }

    private static boolean isUpdateDataValid(String update){ // aqui
        if(update == null || update.trim().equals("")){
            return false;
        }
        return true;
    }

    public static Result updateData() {

        Form<User> form = formUser.bindFromRequest();

        String departureTime = form.field("departure-time").value();
        String returnTime = form.field("return-time").value();
        String isNewAddress = form.field("new-address").value();
        String isOldAddress = form.field("old-address").value();
        String newReturnAddress = form.field("new-return-address").value();

        User user = getUser();

        if (departureTime == null || returnTime == null) {
            return showUpdateData("");

        } else if(!isUpdateDataValid(departureTime)) {
            LogFile.writeInLog("An user try to choose the departure time, but the time is invalid.");
            return showUpdateData("Invalid Departure time");

        } else if (!isUpdateDataValid(returnTime)) {
            LogFile.writeInLog("An user try to choose the return time, but the time is invalid.");
            return showUpdateData("Return time is invalid"); // olhar

        } else if (isNewAddress != null) {

            if(newReturnAddress.trim().equals("")) {
                LogFile.writeInLog("An user try write the new return address, but the new return address is invalid.");
                return showUpdateData("Invalid New Return Address");
            }
            try{
                user.setDistrict(newReturnAddress);

            } catch (Exception e){

            }
        }
        user.setDepartureTime(departureTime);
        user.setReturnTime(returnTime);


        db.updateUser(user); //aqui


        return showPerfil();


    }

    public static Result changeUser(){
        if(actualPerfilIsDriver){
            actualPerfilIsDriver = false;
        }else{
            actualPerfilIsDriver = true;
        }
        return showPerfil();

    }

    public static Result setLanguage(String language) {
        try {
            strings.setLanguage(language);
            session("language", language);
        } catch (IllegalArgumentException e) {
            return badRequest();
        }
        return ok();
    }

}
