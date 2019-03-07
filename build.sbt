name := "akka"

version := "0.1"

scalaVersion := "2.12.8"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.19"

)
libraryDependencies += "com.typesafe.akka" %% "akka-agent" % "2.5.21"

libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.5.21"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-cluster-sharding
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding" % "2.5.21"




//libraryDependencies += "com.typesafe.akka" %  "akka-distributed-data-experimental_2.11" % "2.5.21"