
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object perfilDriver_Scope0 {
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

class perfilDriver extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[controllers.Models.User,play.data.Form[controllers.Models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: controllers.Models.User, form: play.data.Form[controllers.Models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""

"""),_display_(/*3.2*/main("Carona")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">

    <head style="background-color: gray">
        <meta charset="UTF-8">
        <title>Carona</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*11.112*/("""">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*12.70*/("""" type="text/javascript"></script>
        <script type="text/css">
    #page-header"""),format.raw/*14.17*/("""{"""),format.raw/*14.18*/("""
    """),format.raw/*15.5*/("""text-align: center;
    background: grey !important;
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""

    """),format.raw/*19.5*/("""body"""),format.raw/*19.9*/("""{"""),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""background: blue;
    background-color: #1b6d85 !important;
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""

    """),format.raw/*24.5*/("""</script>
    </head>


    <body style="color: #1b6d85">
        <div  class="page-header" align="center" style="background-clip: border-box">
            <h1>Carona</h1>
        </div>
        <div class="row" style="background-color: #1b6d85">
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" style="margin: 10px">
                    <img src=""""),_display_(/*35.32*/routes/*35.38*/.Assets.versioned("images/images.jpg")),format.raw/*35.76*/("""" alt="...">
                    <div class="caption">
                        <h3>"""),_display_(/*37.30*/(usuario.getName())),format.raw/*37.49*/(""", motorista <br>(0 vagas em seu veículo)</br></h3>
                    </div>
                    <div class="caption" style="margin-top: 0px">
                        <a href="/newCarona">New Carona</a>
                    </div>
                    <div class="caption">
                        <h4 style="color: #2b669a"><u>Update data</u></h4>
                    </div>
                    <div class="caption" style="margin-top: 0px">
                        <a href="/logout">Logout</a>
                    </div>

                </div>
            </div>
            <div class="col-sm-6" style="margin-top: 10px">
                <div class="row">
                    <h1 style="color: #000000">Solicitations:</h1>
                </div>
                <ul class="list-group">
                    int vagas = """),_display_(/*56.34*/usuario/*56.41*/.getMyCaronasCreateds()),format.raw/*56.64*/(""";
                    """),_display_(/*57.22*/for(solicitationsIndex <- 0 to 3) yield /*57.55*/{_display_(Seq[Any](format.raw/*57.56*/("""
                        """),_display_(/*58.26*/helper/*58.32*/.form(routes.UserController.selectSolicitation())/*58.81*/ {_display_(Seq[Any](format.raw/*58.83*/("""
                        """),format.raw/*59.25*/("""<li class="list-group-item", id="solicitationsIndex", name="linha">
                            <button type="submit" href="#" value=""""),_display_(/*60.68*/solicitationsIndex),format.raw/*60.86*/("""" name="solicitationsIndex">
                                <ul class="list-group" style="display: inline;">
                                    <div><img  style="width: 50px; height: 50px;display: block; float:left; margin:10px" src=""""),_display_(/*62.128*/routes/*62.134*/.Assets.versioned("images/images.jpg")),format.raw/*62.172*/("""" alt="..."></div>
                                    <div style="margin-left:10px;">Name: Carlos Interaminense</div>
                                    <div style="margin-left:10px;">Destino: Centenário</div>
                                    <div style="margin-left:10px;">Horário: 8h:30m</div>
                                </ul>
                            </button>
                        </li>
                        """)))}),format.raw/*69.26*/("""
                    """)))}),format.raw/*70.22*/("""
                """),format.raw/*71.17*/("""</ul>
            </div>
        </div>
        <footer class="well well-lg" style="text-align: center">
            Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated

        </footer>
        <script style="font-size: 14" language="JavaScript">
            window.alert("Voce tem x solicitações de carona")
        </script>
    </body>
</html>
""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(usuario:controllers.Models.User,form:play.data.Form[controllers.Models.User]): play.twirl.api.HtmlFormat.Appendable = apply(usuario,form)

  def f:((controllers.Models.User,play.data.Form[controllers.Models.User]) => play.twirl.api.HtmlFormat.Appendable) = (usuario,form) => apply(usuario,form)

  def ref: this.type = this

}


}

/**/
object perfilDriver extends perfilDriver_Scope0.perfilDriver
              /*
                  -- GENERATED --
                  DATE: Thu Apr 21 20:41:36 BRT 2016
                  SOURCE: /home/carlos/git/web-application-for-si/app/views/perfilDriver.scala.html
                  HASH: 9a213ce02062317cd5b7c1747142062821c8edd2
                  MATRIX: 816->1|992->82|1020->85|1042->99|1081->101|1109->103|1326->293|1341->299|1415->351|1467->376|1482->382|1544->423|1656->507|1685->508|1717->513|1801->570|1829->571|1862->577|1893->581|1922->582|1954->587|2045->651|2073->652|2106->658|2516->1041|2531->1047|2590->1085|2701->1169|2741->1188|3589->2009|3605->2016|3649->2039|3699->2062|3748->2095|3787->2096|3840->2122|3855->2128|3913->2177|3953->2179|4006->2204|4168->2339|4207->2357|4472->2594|4488->2600|4548->2638|5011->3070|5064->3092|5109->3109|5516->3486
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|46->15|48->17|48->17|50->19|50->19|50->19|51->20|53->22|53->22|55->24|66->35|66->35|66->35|68->37|68->37|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|91->60|91->60|93->62|93->62|93->62|100->69|101->70|102->71|114->83
                  -- GENERATED --
              */
          