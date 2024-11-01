ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("ch.epfl.scala"  % "sbt-scalafix"  % "0.13.0")
addSbtPlugin("com.eed3si9n"   % "sbt-buildinfo" % "0.12.0")
addSbtPlugin("com.github.sbt" % "sbt-git"       % "2.1.0")
addSbtPlugin("org.scoverage"  % "sbt-scoverage" % "2.2.0")
addSbtPlugin("org.scalameta"  % "sbt-scalafmt"  % "2.5.2")
