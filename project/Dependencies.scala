import sbt._

object Dependencies {

  object Version {
    val scala211                = "2.11.12"
    val scala212                = "2.12.10"
    val scala213                = "2.13.1"

    val shapeless               = "2.3.3"
    val typesafeConfig          = "1.4.0"

    val scalaTest               = "3.1.0"
    val scalaTestPlusScalaCheck = "3.1.0.1"

    val scalaCheck              = "1.14.3"
    val scalaCheckShapeless     = "1.2.4"
  }

  val shapeless = "com.chuusai" %% "shapeless" % Version.shapeless
  val typesafeConfig = "com.typesafe" % "config" % Version.typesafeConfig

  // testing libraries
  val scalaTest = "org.scalatest" %% "scalatest" % Version.scalaTest
  val scalaTestPlusScalaCheck = "org.scalatestplus" %% "scalacheck-1-14" % Version.scalaTestPlusScalaCheck
  val scalaCheck = "org.scalacheck" %% "scalacheck" % Version.scalaCheck
  val scalaCheckShapeless =
    "com.github.alexarchambault" %% s"scalacheck-shapeless_1.14" % Version.scalaCheckShapeless
}
