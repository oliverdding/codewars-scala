ThisBuild / version := "0.0.1"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "codewars",
    idePackagePrefix := Some("com.github.oliverdding.codewars"),
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.10",
      "org.scalatest" %% "scalatest" % "3.2.10" % "test"
    )
  )
