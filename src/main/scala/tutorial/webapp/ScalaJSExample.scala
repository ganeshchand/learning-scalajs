package tutorial.webapp

import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.html
import scalatags.JsDom.all._
/**
  * Created by ganeshchand on 8/20/16.
  */
@JSExport
object ScalaJSExample {
  @JSExport
  def main(container: html.Div): Unit = {
    container.innerHTML = ""
    container.appendChild(
      div(
        h1("Hello World"),
        p("Scalajs example using scalatags")
      ).render
    )
  }

}
