ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "my-banking-app",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
  )