import sbt._
import sbt.Keys._

object TppBuild extends Build {

  lazy val tpp = Project(
    id = "tpp",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "tpp",
      organization := "com.takashabe.tpp",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2"
    )
  )
}
