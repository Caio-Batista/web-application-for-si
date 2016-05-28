package controllers;

import static controllers.UserController.showLogin;
import static controllers.UserController.showRegister;
import static play.data.Form.form;

import java.util.List;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;
import Models.Solicitations;
import controllers.Models.User;
import controllers.Models.Carona;
import io.jsonwebtoken.SignatureException;
import play.mvc.Controller;
import play.data.Form;
import play.mvc.Result;
import DBManager.*;
import controllers.Models.*;
import LogFile.*;
import controllers.UserController;

public class CaronaController extends Controller {



    private static Form<User> formUser = form(User.class).bindFromRequest();

    private static DBManager db = DBManager.getInstance();

    private static LocalizedStrings strings;
    static {
        String language = session("language");
        if (language == null) {
            strings = LocalizedStrings.getInstance("EN"); //default
        } else {
            strings = LocalizedStrings.getInstance(language);
        }
    }

    public static Result showNewCarona(String token, String errorMensage, boolean error){
        return ok(views.html.newCarona.render(token, formUser, errorMensage, error, strings));
    }

    public static Result showNewCarona(String tokenUser){
        return showNewCarona(tokenUser, "", false);
    }

    private static boolean numVacanciesIsValid(String vacancies) {
        int numVacancies = Integer.parseInt(vacancies);

        if (numVacancies <=0 || numVacancies > getUser().getNumberOfVacancies()){
            return false;
        }

        return true;
    }

    public static String verificaToken(String token){
        Key key = KeyToken.getInstance().getKey();
        try {
            String idUsuario = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody().getSubject();
            return idUsuario;
        } catch (SignatureException e) {
            return null;
            //don't trust the JWT!
        }
    }

    public static Result createCarona(){
        Form<User> form = formUser.bindFromRequest();
        String token = form.field("token").value();
        String actualUserID = verificaToken(token);
        if(actualUserID == null){
            return showNewCarona(token, "Token Invalid", true);
        }else {
            String startingDistrict = form.field("startingDistrict").value();
            String startingRoad = form.field("startingRoad").value();
            String arrivalDistrict = form.field("arrivalDistrict").value();
            String arrivalRoad = form.field("arrivalRoad").value();
            String numberVacancies = form.field("numberVacancies").value();
            String startingTme = form.field("startingTme").value();


            if (startingDistrict == null || startingDistrict.trim().equals("")) {
                LogFile.writeInLog("An user try create an new Carona, but starting district is invalid.");
                return showNewCarona(token, strings.get("newCarona_invalided_leaving_neaghbordhood"), true);
            } else if (startingRoad == null || startingRoad.trim().equals("")) {
                LogFile.writeInLog("An user try create an new Carona, but starting road is invalid.");
                return showNewCarona(token, strings.get("newCarona_invalided_leaving_street"), true);
            } else if (arrivalDistrict == null || arrivalDistrict.trim().equals("")) {
                LogFile.writeInLog("An user try create an new Carona, but arrival district is invalid.");
                return showNewCarona(token, strings.get("newCarona_invalided_going_neaghbordhood"), true);
            } else if (arrivalRoad == null || arrivalRoad.trim().equals("")) {
                LogFile.writeInLog("An user try create an new Carona, but starting road is invalid.");
                return showNewCarona(token, strings.get("newCarona_invalided_going_street"), true);
            } else if (numberVacancies == null || numberVacancies.trim().equals("") || !numVacanciesIsValid(numberVacancies)) {
                return showNewCarona(token, strings.get("newCarona_invalided_number_seats"), true);
            } else if (startingTme == null || startingTme.trim().equals("")) {
                LogFile.writeInLog("An user try create an new Carona, but starting time is invalid.");
                return showNewCarona(token, strings.get("newCarona_invalided_departure_time"), true);
            }

            if (getUser().getNumberOfVacanciesFree() < Integer.parseInt(numberVacancies)) {
                LogFile.writeInLog("An user try create an new Carona, but, the user doesn't has the number of vacancies free.");
                return showNewCarona(token, strings.get("newCarona_not_exist_vacancies"), true);

            }

            Carona carona = new Carona(getUser().getEmail(), startingDistrict, startingRoad, arrivalDistrict, arrivalRoad, startingTme, Integer.parseInt(numberVacancies));

            User user = getUser();

            user.addCarona(carona);

            user.setNumberOfVacanciesFree(user.getNumberOfVacanciesFree() - Integer.parseInt(numberVacancies));

            db.updateUser(user);
            return UserController.showPerfil();
        }
    }

    public static Result acceptSolicitation(Integer id) {
//        int numVacancies = getUser().getMyCaronasCreateds().get(id).getNumberOfVacancies();
 //       getUser().getMyCaronasCreateds().get(id).setNumberOfVacancies(numVacancies-1);
        getUser().setAcceptSolicitationbyIndex(id, true);
        db.updateUser(getUser());

        return ok("");
    }

    public static Result rejectSolicitation(Integer id) {
        getUser().removeSolicitation(id);
        return ok("");
    }

    public static Result askCaronaForDriver(Integer id){
        User u = db.searchUserByEmail(getUser().getAvaliableCaronas().get(id).getEmail());
        u.addSolicitation(new Solicitations(getUser().getEmail(), getUser().getName(), getUser().getDistrict(), getUser().getDepartureTime(), getUser().getPhoneNumber()));
        db.updateUser(u);
        return ok("");
    }

    public static Result rejectCarona(Integer id){
        return ok("");
    }

    public static User getUser() {
        return UserController.getUser();
    }



}