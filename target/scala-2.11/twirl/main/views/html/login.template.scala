
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[controllers.Models.User],String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: play.data.Form[controllers.Models.User],errorMenssage: String, isError: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

"""),_display_(/*3.2*/main("Carona")/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
  <head>
    <meta name="viewport" content="width=device-width", initial-scale=1.0 charset="UTF-8" />
    <title>Carona</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*8.108*/("""">
    <link rel="stylesheet" href="styles.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/login-style.css")),format.raw/*10.104*/("""">

  </head>
  <body>

    <div id="header">
      <h1>Carona</h1>
    </div>

    <div id="login-form" class="forms">
      <div id="Login" class="text-center">
        <div class="logo">Login</div>
      </div>

      """),_display_(/*24.8*/if(errorMenssage != null && !errorMenssage.trim().equals(""))/*24.69*/ {_display_(Seq[Any](format.raw/*24.71*/("""
        """),_display_(/*25.10*/if(isError)/*25.21*/ {_display_(Seq[Any](format.raw/*25.23*/("""
          """),format.raw/*26.11*/("""<div class="alert alert-danger">
            <p>"""),_display_(/*27.17*/(errorMenssage)),format.raw/*27.32*/("""</p>
          </div>
        """)))}/*29.11*/else/*29.16*/{_display_(Seq[Any](format.raw/*29.17*/("""
          """),format.raw/*30.11*/("""<div class="alert alert-success">
            <p>"""),_display_(/*31.17*/(errorMenssage)),format.raw/*31.32*/("""</p>
          </div>
        """)))}),format.raw/*33.10*/("""
      """)))}),format.raw/*34.8*/("""

      """),_display_(/*36.8*/helper/*36.14*/.form(routes.UserController.authenticate())/*36.57*/ {_display_(Seq[Any](format.raw/*36.59*/("""
        """),format.raw/*37.9*/("""<div id="input-email" class="input">
          <input type="email" class="form-control" name="email" required autofocus placeholder="Email" value=""""),_display_(/*38.112*/form("email")/*38.125*/.value),format.raw/*38.131*/(""""/>
        </div>

        <div id="input-password" class="input">
          <input type="password" class="form-control" name="password" required placeholder="Password">
        </div>

        <button id="btn-login" type="submit" class="login-button"> Login
          <i class="fa fa-chevron-right"></i>
        </button>
      """)))}),format.raw/*48.8*/("""


      """),format.raw/*51.7*/("""<div id="sign-up" class="etc-login-form" >
        Do you don't have an account? <a href="#" onclick="sign_up_click()">Sign up now</a>
      </div>
    </div>

    <footer class="well well-lg">
      Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated
    </footer>

    <script>
            function sign_up_click()"""),format.raw/*61.37*/("""{"""),format.raw/*61.38*/("""
              """),format.raw/*62.15*/("""window.location.href = "http://localhost:9000/register"
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/(""";
    </script>

  </body>
  </html>
""")))}),format.raw/*68.2*/("""

"""))
      }
    }
  }

  def render(form:play.data.Form[controllers.Models.User],errorMenssage:String,isError:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(form,errorMenssage,isError)

  def f:((play.data.Form[controllers.Models.User],String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (form,errorMenssage,isError) => apply(form,errorMenssage,isError)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 23:08:37 BRT 2016
                  SOURCE: /home/carlos/git/web-application-for-si/app/views/login.scala.html
                  HASH: 159700f774b838c91cd0697d28aeed70ced39e00
                  MATRIX: 793->1|975->88|1003->91|1025->105|1063->106|1090->107|1309->300|1323->306|1396->358|1521->456|1536->462|1606->510|1854->732|1924->793|1964->795|2001->805|2021->816|2061->818|2100->829|2176->878|2212->893|2262->925|2275->930|2314->931|2353->942|2430->992|2466->1007|2528->1038|2566->1046|2601->1055|2616->1061|2668->1104|2708->1106|2744->1115|2920->1263|2943->1276|2971->1282|3332->1613|3368->1622|3739->1965|3768->1966|3811->1981|3907->2049|3936->2050|4004->2088
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|41->10|41->10|41->10|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|64->33|65->34|67->36|67->36|67->36|67->36|68->37|69->38|69->38|69->38|79->48|82->51|92->61|92->61|93->62|94->63|94->63|99->68
                  -- GENERATED --
              */
          