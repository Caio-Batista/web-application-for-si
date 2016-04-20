
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object perfilPassenger_Scope0 {
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

class perfilPassenger extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head style="...">
        <meta charset="UTF-8">
        <title>Menu principal</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.59*/routes/*6.65*/.Assets.versioned("images/favicon.png")),format.raw/*6.104*/("""">
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*10.112*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/jquery-1.12.1.min.js")),format.raw/*12.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*13.79*/("""" type="text/javascript"></script>
        <script type="text/css">
            .DESTINO:after"""),format.raw/*15.27*/("""{"""),format.raw/*15.28*/("""
                """),format.raw/*16.17*/("""background-color: #1b6d85 !important;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
            """),format.raw/*18.13*/(""".vcenter """),format.raw/*18.22*/("""{"""),format.raw/*18.23*/("""
                """),format.raw/*19.17*/("""display: inline-block;
                vertical-align: middle;
                float: none;
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</script>

    </head>
    <body >
        <div class="page-header" style="text-align: center">
            <h1>Menu principal <small>Solicitações</small></h1>
        </div>
        <div style="background-color: #1b6d85">

            <ul class="nav nav-tabs" style="background-color: #5bc0de">
                <li class="active"><a data-toggle="tab" href="#DESTINO" style="background-color: #5bc0de">DESTINO</a></li>
                <li><a data-toggle="tab" href="#RETORNO">RETORNO</a></li>

            </ul>

            <div class="tab-content" style="background-color: #1b6d85; align-content: center; vertical-align: middle">
                <div id="DESTINO" class="tab-pane fade in active" style="background-color: #1b6d85">

                    <div class="col-lg-12 col-md-7 vcenter" style="background-color: #1b6d85;
                    align-content: center; vertical-align: middle">
                        <ul class="list-group" style="background-color: #1b6d85">
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                        </ul>
                    </div>
                </div>
                <div id="RETORNO" class="tab-pane fade">
                    <div class="col-lg-12 col-md-7 vcenter" style="background-color: #1b6d85;
                    align-content: center; vertical-align: middle">
                        <ul class="list-group" style="background-color: #1b6d85">
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>
                            <li class="list-group-item">Nome completo: Fulano       /         Telefone: 555 52525 123
                            </li>

                        </ul>
                    </div>

                </div>

            </div>
        </div>
        <footer class="well well-lg" style="text-align: center; vertical-align: bottom">
            Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated

        </footer>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object perfilPassenger extends perfilPassenger_Scope0.perfilPassenger
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 23:42:38 BRT 2016
                  SOURCE: /home/caio/web-application-for-si/app/views/perfilPassenger.scala.html
                  HASH: 69c1d453f5d733cd358f01c458e411005e322785
                  MATRIX: 847->0|1056->183|1070->189|1130->228|1292->363|1307->369|1381->421|1433->446|1448->452|1510->493|1594->550|1609->556|1683->609|1767->666|1782->672|1853->722|1975->816|2004->817|2049->834|2127->884|2156->885|2197->898|2234->907|2263->908|2308->925|2440->1029|2469->1030|2505->1039
                  LINES: 32->1|37->6|37->6|37->6|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|46->15|46->15|47->16|48->17|48->17|49->18|49->18|49->18|50->19|53->22|53->22|54->23
                  -- GENERATED --
              */
          