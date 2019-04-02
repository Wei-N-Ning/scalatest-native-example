scalaVersion := "2.11.12"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)

libraryDependencies += "org.scalatest" % "scalatest_native0.3_2.11" % "3.2.0-SNAP10"

