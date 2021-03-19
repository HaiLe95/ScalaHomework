//Scala style checker: scalastyle
//Usage: terminal =>
//                  sbt scalastyle
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

//SBT deploy single JAR: stb-assembly
//Usage: terminal =>
//                  sbt package
//                  sbt assembly
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

//scala linter: scalafix
//Usage: ???
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.26")