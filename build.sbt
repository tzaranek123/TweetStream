name := "TweetStream"

version := "1.0"

scalaVersion := "2.12.4"

libraryDependencies ++= {
  Seq(
    "com.typesafe.akka" %% "akka-stream" % "2.5.12",
    "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.12" % Test
  )
}