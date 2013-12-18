import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "BackToBasics"

version := "0.1"

scalaVersion := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/"
)

libraryDependencies ++= {
  Seq(
    "ch.qos.logback" % "logback-classic" % "1.0.12",
    "org.scalatest" %% "scalatest" % "2.0.M7" % "test",
    "com.novocode" % "junit-interface" % "0.10" % "test"
  )
}

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")

jacoco.settings
