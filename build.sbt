import com.lihaoyi.workbench.Plugin._

enablePlugins(ScalaJSPlugin)

workbenchSettings


name := "scalajs-basic-tutorial"

version := "1.0"

scalaVersion := "2.11.8"

//persistLauncher in Compile := true
//
//persistLauncher in Test := true

//%%% means this is not a normal Scala library
libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "com.lihaoyi" %%% "scalatags" % "0.6.0")

bootSnippet := "tutorial.webapp.ScalaJSExample().main(document.getElementById('container'))"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)