package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import controllers.Models.User;
import controllers.*;
import DBManager.*;
import play.mvc.Controller;
import play.mvc.Result;
import static play.data.Form.form;
import play.data.Form;
import play.*;
import views.html.login;
import views.html.perfil;


public class Application extends Controller {

    public static Result index() {
        User user = UserController.getUser();
        return ok(index.render(user));
    }

    public static Result login() {
        return ok (login.render(form(User.class), "", false));}

}

