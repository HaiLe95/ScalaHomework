name := "ScalaHomework"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8"

// sbt assembly configs:
assemblyJarName in assembly := "ScalaHomework.jar"
mainClass in assembly       := Some("Main")


//hairyfotr-linter configs:
//scalacOptions += "-P:linter:printWarningNames:false"