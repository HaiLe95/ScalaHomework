name := "ScalaHomework"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8"

// sbt assembly configs:
test            in assembly := {}
mainClass       in assembly := Some("src/main/scala/Main.scala")
assemblyJarName in assembly := "ScalaHomework.jar"

//hairyfotr-linter configs:
//scalacOptions += "-P:linter:printWarningNames:false"