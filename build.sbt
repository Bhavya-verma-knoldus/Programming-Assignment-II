name := "Programming Assignment - II"

version := "0.1"

scalaVersion := "2.13.5"

lazy val program = project.in(file("Program"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % "test"
  )

lazy val root = project.in(file(".")).aggregate(program)