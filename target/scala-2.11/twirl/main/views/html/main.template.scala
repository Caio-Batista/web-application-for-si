
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*13.10*/content),format.raw/*13.17*/("""
    """),format.raw/*14.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Tue Apr 19 23:08:37 BRT 2016
                  SOURCE: /home/carlos/git/web-application-for-si/app/views/main.scala.html
=======
                  DATE: Tue Apr 19 23:42:38 BRT 2016
                  SOURCE: /home/caio/web-application-for-si/app/views/main.scala.html
>>>>>>> 846be630752e95e30284d2f38ccd7e94ac0ad1ef
                  HASH: 8cedbde37a63dab360e2e303da0f97d7c7a9eb31
                  MATRIX: 748->1|873->31|901->33|978->84|1003->89|1091->151|1105->157|1159->191|1246->252|1260->258|1312->290|1364->315|1379->321|1445->366|1539->433|1567->440|1599->445
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|44->13|44->13|45->14
                  -- GENERATED --
              */
          