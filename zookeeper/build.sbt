name := "zookeeper"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.apache.zookeeper" % "zookeeper" % "3.4.5"
// https://mvnrepository.com/artifact/org.apache.curator/curator-framework
libraryDependencies += "org.apache.curator" % "curator-framework" % "2.8.0"
// https://mvnrepository.com/artifact/org.apache.curator/curator-recipes
libraryDependencies += "org.apache.curator" % "curator-recipes" % "2.8.0"
