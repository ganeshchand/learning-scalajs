package tutorial.webapp

import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.html
import org.w3c.dom.Attr

import scalatags.JsDom.all._

/**
  * Created by ganeshchand on 8/20/16.
  */
@JSExport
object ScalaJSExample {
  @JSExport
  def main(container: html.Div): Unit = {

    container.innerHTML = ""
    val myInput = input.render
    val output = div.render

    val fruits = Seq(
      "Apple",
      "Banana",
      "Pineapple",
      "Mango",
      "Mangosteen",
      "Mandarin"
    )
    myInput.onkeyup = (e: dom.Event) => {
      //      println(myInput.value)
      //      output.textContent = myInput.value
      output.innerHTML = ""
      output.appendChild(
        ul(
          for {fruit <- fruits
               if (fruit.toLowerCase().contains(myInput.value))

          } yield {

            val (matchedText, remainingText) = fruit.splitAt(myInput.value.length)
            li(
              span(matchedText, backgroundColor := "yellow"),
              remainingText
            )
          }
        ).render

      )
    }

    container.appendChild(
      div(
        h1("Hello World"),
        p("Scalajs example using scalatags"),
        myInput,
        output
      ).render
    )
  }

}
