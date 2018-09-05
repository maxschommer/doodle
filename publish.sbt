ThisBuild / name := "doodle"
ThisBuild / organization := "org.creativescala"
ThisBuild / organizationName := "Creative Scala"
ThisBuild / organizationHomepage := Some(url("http://creativescala.org/"))
ThisBuild / version := "0.9.0-SNAPSHOT"

ThisBuild / useGpg := true
ThisBuild / pgpSecretRing := pgpPublicRing.value

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/creative-scala/doodle"),
    "scm:git@github.com:creative-scala/doodle.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "noelwelsh",
    name  = "Noel Welsh",
    email = "noel@underscore.io",
    url   = url("http://noelwelsh.com")
  )
)

ThisBuild / description := "Compositional graphics for Scala"
ThisBuild / licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/creativescala/doodle"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true