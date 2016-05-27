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

import Models.dao.GenericDAO;
import Models.dao.GenericDAOImpl;
import play.db.jpa.Transactional;



public class Application extends Controller {

    private static GenericDAO dao = new GenericDAOImpl();

    public static Result index() {
        User user = UserController.getUser();
        return ok(index.render(user));
    }

    @Transactional
    public static GenericDAO getDao(){
        return dao;
    }

    @Transactional
    public static void persisteObjeto(Object o) {
        Application.getDao().persist(o);
        Application.getDao().merge(o);
        Application.getDao().flush();
    }

}

