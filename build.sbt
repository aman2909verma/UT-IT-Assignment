name := "UT IT Assignment"
version := "1.0"
scalaVersion := "2.12.12"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2" % "test"
lazy val mockitoScala = "org.mockito" %% "mockito-scala" % "1.5.12" % "test"
lazy val module1 = project.in(file("module1"))
          .settings(
             libraryDependencies ++= Seq(scalaTest,mockitoScala)
)
lazy val module2 = project.in(file("module2"))
          .settings(
          libraryDependencies ++= Seq(scalaTest,mockitoScala)
)

lazy val root = project.in(file(".")).aggregate(module1,module2)
