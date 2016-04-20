
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carlos/git/web-application-for-si/conf/routes
// @DATE:Tue Apr 19 23:08:34 BRT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""", """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """perfilDriver""", """controllers.UserController.showPerfil()"""),
    ("""GET""", prefix, """controllers.UserController.showLogin()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.showLogin()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.showRegister()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.register()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """index"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_showPerfil1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perfilDriver")))
  )
  private[this] lazy val controllers_UserController_showPerfil1_invoker = createInvoker(
    controllers.UserController.showPerfil(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showPerfil",
      Nil,
      "GET",
      """""",
      this.prefix + """perfilDriver"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_showLogin2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_showLogin2_invoker = createInvoker(
    controllers.UserController.showLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_showLogin3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_showLogin3_invoker = createInvoker(
    controllers.UserController.showLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_showRegister4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_showRegister4_invoker = createInvoker(
    controllers.UserController.showRegister(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showRegister",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_at5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_authenticate6_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate6_invoker = createInvoker(
    controllers.UserController.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_register7_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_register7_invoker = createInvoker(
    controllers.UserController.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
      }
  
    // @LINE:8
    case controllers_UserController_showPerfil1_route(params) =>
      call { 
        controllers_UserController_showPerfil1_invoker.call(controllers.UserController.showPerfil())
      }
  
    // @LINE:10
    case controllers_UserController_showLogin2_route(params) =>
      call { 
        controllers_UserController_showLogin2_invoker.call(controllers.UserController.showLogin())
      }
  
    // @LINE:11
    case controllers_UserController_showLogin3_route(params) =>
      call { 
        controllers_UserController_showLogin3_invoker.call(controllers.UserController.showLogin())
      }
  
    // @LINE:12
    case controllers_UserController_showRegister4_route(params) =>
      call { 
        controllers_UserController_showRegister4_invoker.call(controllers.UserController.showRegister())
      }
  
    // @LINE:16
    case controllers_Assets_at5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
      }
  
    // @LINE:17
    case controllers_UserController_authenticate6_route(params) =>
      call { 
        controllers_UserController_authenticate6_invoker.call(controllers.UserController.authenticate())
      }
  
    // @LINE:18
    case controllers_UserController_register7_route(params) =>
      call { 
        controllers_UserController_register7_invoker.call(controllers.UserController.register())
      }
  
    // @LINE:20
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(controllers.Assets.versioned(path, file))
      }
  }
}