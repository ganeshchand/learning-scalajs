package tutorial.webapp

import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom.html
/**
  * Created by ganeshchand on 8/20/16.
  */
@JSExport
object ScalaJSExample {
  @JSExport
  def main(container: html.Div): Unit = {
    container.innerHTML = "<h1> Hello World</h1>"
//  println("Hello World")
  }

}
