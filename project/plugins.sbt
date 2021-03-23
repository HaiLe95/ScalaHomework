//Scala style checker: scalastyle
//Usage: terminal =>
//                  sbt scalastyle
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

//SBT deploy single JAR: stb-assembly
//Usage: terminal =>
//                  sbt package
//                  sbt assembly
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")

//scala linter: hairyfotr-linter
//Usage: built.sbt => scalaOptions...
resolvers += Resolver.sonatypeRepo("snapshots")
addCompilerPlugin("org.psywerx.hairyfotr" %% "linter" % "0.1-SNAPSHOT")

