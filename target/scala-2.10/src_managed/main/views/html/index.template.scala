
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
	<h1>"""),_display_(Seq[Any](/*6.7*/if(@tasks.size()==1)/*6.27*/{_display_(Seq[Any](_display_(Seq[Any](/*6.29*/tasks/*6.34*/.size())),format.raw/*6.41*/("""task""")))}/*6.46*/else/*6.50*/{_display_(Seq[Any](format.raw/*6.51*/(""" task(s)""")))})),format.raw/*6.60*/("""</h1>
	<ul>
		"""),_display_(Seq[Any](/*8.4*/for(task <- tasks) yield /*8.22*/{_display_(Seq[Any](format.raw/*8.23*/("""
			<li>
				"""),_display_(Seq[Any](/*10.6*/task/*10.10*/.label)),format.raw/*10.16*/("""
				"""),_display_(Seq[Any](/*11.6*/form(routes.Application.deleteTask(task.id))/*11.50*/ {_display_(Seq[Any](format.raw/*11.52*/("""
					<input type="submit" value="Delete" >
				""")))})),format.raw/*13.6*/("""
			</li>
		""")))})),format.raw/*15.4*/("""
	</ul>
	<h2>Add a new Task</h2>
	"""),_display_(Seq[Any](/*18.3*/form(routes.Application.newTask())/*18.37*/ {_display_(Seq[Any](format.raw/*18.39*/("""
		"""),_display_(Seq[Any](/*19.4*/inputText(taskForm("label")))),format.raw/*19.32*/("""
		<input type="submit" value="Create">
	""")))})),format.raw/*21.3*/("""
""")))})),format.raw/*22.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.HtmlFormat.Appendable = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 27 14:13:55 CET 2015
                    SOURCE: C:/Users/Tobias/DAI-Labor/aal13/playTest/helloworld/app/views/index.scala.html
                    HASH: 979c891e2d3060092b48808034844d0a7b555e7d
                    MATRIX: 789->1|940->42|968->61|1004->63|1029->80|1067->81|1108->88|1136->108|1183->110|1196->115|1224->122|1247->127|1259->131|1297->132|1337->141|1386->156|1419->174|1457->175|1506->189|1519->193|1547->199|1588->205|1641->249|1681->251|1761->300|1805->313|1875->348|1918->382|1958->384|1997->388|2047->416|2120->458|2153->460
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|41->13|43->15|46->18|46->18|46->18|47->19|47->19|49->21|50->22
                    -- GENERATED --
                */
            