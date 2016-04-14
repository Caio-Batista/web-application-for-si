
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

class perfilDriver extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[controllers.Models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: controllers.Models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

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
                    <img src=""""),_display_(/*35.32*/routes/*35.38*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*35.80*/("""" alt="...">
                    <div class="caption">
                        <h3>"""),_display_(/*37.30*/(usuario.getName())),format.raw/*37.49*/(""", motorista</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-6" style="margin-top: 10px">
                <div style="color: #000000">
                    <h1>Solicitations:</h1>
                </div>
                <ul class="list-group">
                    <li class="list-group-item">
                        <a href="#" style="text-decoration: none;">
                        <ul class="list-group" style="display: inline;">
                            <div><img  style="width: 50px; height: 50px;display: block; float:left; margin:10px" src=""""),_display_(/*49.120*/routes/*49.126*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*49.168*/("""" alt="..."></div>
                            <div style="margin-left:10px;">Nome: Carlos Interaminense</div>
                            <div style="margin-left:10px;">Destino: Centenário</div>
                            <div style="margin-left:10px;">Horário: 8h:30m</div>
                        </ul>
                        </a>
                    </li>


                    <li class="list-group-item">
                        <a href="#" style="text-decoration: none;">
                        <ul class="list-group" style="display: inline;">
                            <div><img  style="width: 50px; height: 50px;display: block; float:left; margin:10px" src=""""),_display_(/*61.120*/routes/*61.126*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*61.168*/("""" alt="..."></div>
                            <div style="margin-left:10px;">Nome: Izabella Antonino</div>
                            <div style="margin-left:10px;">Destino: Centenário</div>
                            <div style="margin-left:10px;">Horário: 8h:30m</div>
                        </ul>
                        </a>
                    </li>
                    <li class="list-group-item">
                        <a href="#" style="text-decoration: none;">
                        <ul class="list-group" style="display: inline;">
                            <div><img  style="width: 50px; height: 50px;display: block; float:left; margin:10px" src=""""),_display_(/*71.120*/routes/*71.126*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*71.168*/("""" alt="..."></div>
                            <div style="margin-left:10px;">Nome: Jeffs</div>
                            <div style="margin-left:10px;">Destino: Centenário</div>
                            <div style="margin-left:10px;">Horário: 8h:30m</div>
                        </ul>
                        </a>
                    </li>
                    <li class="list-group-item">
                        <a href="#" style="text-decoration: none;">
                        <ul class="list-group" style="display: inline;">
                            <div><img  style="width: 50px; height: 50px;display: block; float:left; margin:10px" src=""""),_display_(/*81.120*/routes/*81.126*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*81.168*/("""" alt="..."></div>
                            <div style="margin-left:10px;">Nome: Caio Oliveira</div>
                            <div style="margin-left:10px;">Destino: Centenário</div>
                            <div style="margin-left:10px;">Horário: 8h:30m</div>
                        </ul>
                        </a>
                    </li>
                    <li class="list-group-item">
                        <a href="#" style="text-decoration: none;">
                        <ul class="list-group" style="display: inline;">
                            <div><img  style="width: 50px; height: 50px;display: block; float:left; margin:10px" src=""""),_display_(/*91.120*/routes/*91.126*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*91.168*/("""" alt="..."></div>
                            <div style="margin-left:10px;">Nome: Yago</div>
                            <div style="margin-left:10px;">Destino: Centenário</div>
                            <div style="margin-left:10px;">Horário: 8h:30m</div>
                        </ul>
                        </a>
                    </li>
                </ul>
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
""")))}))
      }
    }
  }

  def render(usuario:controllers.Models.User): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((controllers.Models.User) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object perfilDriver extends perfilDriver_Scope0.perfilDriver
              /*
                  -- GENERATED --
                  DATE: Wed Apr 06 00:51:12 BRT 2016
                  SOURCE: /home/carlos/git/web-app-si-v2/app/views/perfilDriver.scala.html
                  HASH: 68c05618d9c57ee7c09909b9d61b0935d40fc598
                  MATRIX: 776->1|905->35|933->38|955->52|994->54|1022->56|1239->246|1254->252|1328->304|1380->329|1395->335|1457->376|1569->460|1598->461|1630->466|1714->523|1742->524|1775->530|1806->534|1835->535|1867->540|1958->604|1986->605|2019->611|2429->994|2444->1000|2507->1042|2618->1126|2658->1145|3293->1752|3309->1758|3373->1800|4074->2473|4090->2479|4154->2521|4850->3189|4866->3195|4930->3237|5614->3893|5630->3899|5694->3941|6386->4605|6402->4611|6466->4653
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|46->15|48->17|48->17|50->19|50->19|50->19|51->20|53->22|53->22|55->24|66->35|66->35|66->35|68->37|68->37|80->49|80->49|80->49|92->61|92->61|92->61|102->71|102->71|102->71|112->81|112->81|112->81|122->91|122->91|122->91
                  -- GENERATED --
              */
          