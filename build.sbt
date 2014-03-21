name := "hello-scaladin"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "com.vaadin" % "vaadin-server" % "7.1.12",
  "com.vaadin" % "vaadin-client-compiled" % "7.1.12",
  "com.vaadin" % "vaadin-themes" % "7.1.12",
  "javax.servlet" % "servlet-api" % "2.4",
  "org.eclipse.jetty.aggregate" % "jetty-all" % "9.1.0.v20131115",
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-plus" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-annotations" % "9.1.0.v20131115" % "container"
)

seq(webSettings :_*)
