ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
ThisBuild / evictionErrorLevel       := Level.Warn

ThisBuild / scalaVersion     := "2.12.20"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "livongo"
ThisBuild / organizationName := "upgrade"

lazy val upgrade = project
  .in(file("."))
  .settings(
    name         := "upgrade",
    scalaVersion := "2.13.15",
    libraryDependencies ++=
      "org.scalatest"    %% "scalatest"  % "3.2.9"  % Test ::
        "org.scalacheck" %% "scalacheck" % "1.15.4" % Test ::
        Nil
  )
