
name := "allure-scala-example"

version := "0.1"

scalaVersion := "2.12.15"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"


libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"
libraryDependencies += "io.qameta.allure" %% "allure-scalatest" % "2.13.2"

Test / testOptions ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-C", "io.qameta.allure.scalatest.AllureScalatest")
)

Test / parallelExecution := true