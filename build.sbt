name := "untitled"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( javaJdbc ,  cache , javaWs,
                                                  javaJpa,
                                                  "org.apache.directory.api" % "api-all" % "1.0.0-M14",
                                                  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
                                                  "org.hibernate" % "hibernate-core" % "4.2.3.Final",
                                                  "org.hibernate" % "hibernate-entitymanager" % "4.2.3.Final",
                                                  "org.hibernate" % "hibernate-validator" % "4.2.0.Final" )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

fork in run := false
