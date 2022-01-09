ThisBuild / version := "0.0.1"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "codewars",
    idePackagePrefix := Some("com.github.oliverdding.codewars")
  )
