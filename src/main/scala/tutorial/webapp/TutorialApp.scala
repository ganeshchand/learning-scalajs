package tutorial.webapp

import org.scalajs.dom
import dom.document

import scala.scalajs.js.JSApp

/**
  * Created by ganeshchand on 8/15/16.
  */

object TutorialApp extends JSApp {

  def appendParagraph(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
  override def main(): Unit = {
//    println("Hello World")
    appendParagraph(document.body, "Hello, World")
  }
}
