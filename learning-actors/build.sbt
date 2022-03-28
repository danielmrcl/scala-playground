name := "learning-actors"

version := "0.1"

scalaVersion := "2.13.8"
val AkkaVersion = "2.6.18"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-slf4j" % "2.6.18",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
