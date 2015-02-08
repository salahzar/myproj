name := "myproj"
organization := "Karedo"
version := "1.0"
scalaVersion := "2.11.4"

libraryDependencies ++=
  Seq(
    "junit" % "junit" % "4.11" % "test",
    // specs2 CHANGED when using scala 2.11 (!!) needing extra dependencies no
    // more in scala core
    "org.specs2" %% "specs2-core" % "2.4.15" % "test",
    "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.3"
  )
