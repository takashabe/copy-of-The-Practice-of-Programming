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
      scalaVersion := "2.9.2",
      resolvers ++= myResolvers,
      libraryDependencies ++= myLibraryDependecies
    )
  )

  val myLibraryDependecies = Seq (
    "org.specs2" %% "specs2" % "1.12.2" % "test"
  )

  val myResolvers = Seq (
    "release" at "http://oss.sonatype.org/content/repositories/release"
  )

}
