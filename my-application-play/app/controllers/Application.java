package controllers;


import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Let's rock at this major!"));
    }

    public Result perfil(){
        return ok(perfil.render());
    }

    public Result solicitacoes(){
        return ok(solicitacoes.render());
    }
}
