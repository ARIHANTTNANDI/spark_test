name := "spark-essentials"

version := "0.1"

scalaVersion := "2.12.10"

val sparkVersion = "3.0.2"
val vegasVersion = "0.3.11"
val postgresVersion = "42.7.2"
//val Test =

resolvers ++= Seq(
  "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven",
  "Typesafe Simple Repository" at "https://repo.typesafe.com/typesafe/simple/maven-releases",
  "MavenRepository" at "https://mvnrepository.com"
)


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.0",
  "org.apache.spark" %% "spark-sql" % "3.3.0",
  // postgres for DB connectivity
  "org.postgresql" % "postgresql" % postgresVersion,
  "org.scalatest" %% "scalatest" % "3.2.15" % Test)