name := "ScalaHomework"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  // Testing
  "org.scalatest"              %% "scalatest"        % "3.0.8",

  // Logger
  "com.typesafe.scala-logging" %% "scala-logging"    % "3.9.3",
  "ch.qos.logback"              % "logback-classic"  % "1.2.3"
)

// sbt assembly configs:
assemblyJarName in assembly := "ScalaHomework.jar"
mainClass       in assembly :=  Some("Main")


//hairyfotr-linter configs:
//scalacOptions += "-P:linter:printWarningNames:false"