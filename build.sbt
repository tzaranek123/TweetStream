name := "TweetStream"

version := "1.0"

scalaVersion := "2.12.4"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= {

    val akkaVersion = "2.5.12"

    Seq(
          "com.typesafe.akka" %% "akka-stream" % akkaVersion,
          "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
        )
    }
  )
