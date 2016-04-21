
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object perfil_Scope0 {
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

class perfil extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[controllers.Models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(usuario: controllers.Models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.36*/("""

"""),_display_(/*4.2*/main("untitled")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""

"""),format.raw/*6.1*/("""<!DOCTYPE html>
    <html lang="en">

        <head style="background-color: gray">
            <meta charset="UTF-8">
            <title>Perfil do motorista</title>
            <link rel="stylesheet" media="screen" href=""""),_display_(/*12.58*/routes/*12.64*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*12.116*/("""">
            <script src=""""),_display_(/*13.27*/routes/*13.33*/.Assets.versioned("javascripts/hello.js")),format.raw/*13.74*/("""" type="text/javascript"></script>
            <script type="text/css">
    #page-header"""),format.raw/*15.17*/("""{"""),format.raw/*15.18*/("""
    """),format.raw/*16.5*/("""text-align: center;
    background: grey !important;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""

    """),format.raw/*20.5*/("""body"""),format.raw/*20.9*/("""{"""),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""background: blue;
    background-color: #1b6d85 !important;
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""

    """),format.raw/*25.5*/("""</script>
        </head>

        <body style="color: #1b6d85">
            <div  class="page-header" align="center" style="background-clip: border-box">
                <h1>Perfil <small>Motorista</small></h1>
            </div>
            <div class="row" style="background-color: #1b6d85">

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src=""""),_display_(/*36.36*/routes/*36.42*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*36.84*/("""" alt="...">
                        <div class="caption">
                            <h3>"""),_display_(/*38.34*/(usuario.getName())),format.raw/*38.53*/(""", motorista</h3>
                            <p>Informações</p>
                            <p><a href="#" class="btn btn-primary" role="button">Mudar Foto de perfil</a>
                                <a href="#" class="btn btn-default" role="button">Sair</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4">
                    <ul class="list-group">
                        <li class="list-group-item">Nome: """),_display_(/*47.60*/(usuario.getName())),format.raw/*47.79*/("""</li>
                        <li class="list-group-item">Endereco: """),_display_(/*48.64*/(usuario.getDistrict())),format.raw/*48.87*/("""</li>
                        <li class="list-group-item">Telefone residencial: (83) 3333-3333</li>
                        <li class="list-group-item">Matrícula: """),_display_(/*50.65*/(usuario.getRegistration())),format.raw/*50.92*/("""</li>
                        <li class="list-group-item">Email: """),_display_(/*51.61*/(usuario.getEmail())),format.raw/*51.81*/("""</li>
                    </ul>
                </div>
                <div class="col-sm-6 col-md-3 col-lg-offset-0">
                    <div class="panel panel-primary">
                        <div class="panel-body" style="color: #2e6da4">
                            <h1>Numero de vagas</h1>
                        </div>
                        <div class="panel-footer">
                            <h2>NaN</h2>
                        </div>
                    </div>

                </div>
            </div>
            <footer class="well well-lg" style="text-align: center">
                Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated

            </footer>


        </body>
    </html>

""")))}),format.raw/*75.2*/("""
"""))
      }
    }
  }

  def render(usuario:controllers.Models.User): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((controllers.Models.User) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object perfil extends perfil_Scope0.perfil
              /*
                  -- GENERATED --
                  DATE: Thu Apr 21 12:01:33 BRT 2016
                  SOURCE: /home/carlos/git/web-application-for-si/app/views/perfil.scala.html
                  HASH: ace4e4a1fbc94e7453a9ac039e80f8e132776448
                  MATRIX: 764->2|893->36|921->39|945->55|984->57|1012->59|1262->282|1277->288|1351->340|1407->369|1422->375|1484->416|1600->504|1629->505|1661->510|1745->567|1773->568|1806->574|1837->578|1866->579|1898->584|1989->648|2017->649|2050->655|2500->1078|2515->1084|2578->1126|2697->1218|2737->1237|3261->1734|3301->1753|3397->1822|3441->1845|3632->2009|3680->2036|3773->2102|3814->2122|4585->2863
                  LINES: 27->2|32->2|34->4|34->4|34->4|36->6|42->12|42->12|42->12|43->13|43->13|43->13|45->15|45->15|46->16|48->18|48->18|50->20|50->20|50->20|51->21|53->23|53->23|55->25|66->36|66->36|66->36|68->38|68->38|77->47|77->47|78->48|78->48|80->50|80->50|81->51|81->51|105->75
                  -- GENERATED --
              */
          