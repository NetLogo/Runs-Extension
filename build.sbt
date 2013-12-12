scalaVersion := "2.10.3"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xlint", "-Xfatal-warnings",
                      "-encoding", "utf-8", "-language:_")

libraryDependencies ++= Seq(
  "org.nlogo" % "NetLogo" % "5.1.x-0d09a8e" from
    "http://ccl.northwestern.edu/devel/NetLogo-0d09a8e.jar",
  "org.nlogo" % "NetLogoHeadless" % "5.1.x-0d09a8e" from
    "http://ccl.northwestern.edu/devel/NetLogoHeadless-0d09a8e.jar",
  "org.picocontainer" % "picocontainer" % "2.13.6"
)

name := "runs"

NetLogoExtension.settings

NetLogoExtension.classManager := "org.nlogo.extensions.runs.RunsExtension"
