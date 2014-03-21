package org.vaadin.scaladin.hello

import vaadin.scala._
import vaadin.scala.server.ScaladinRequest
import vaadin.scala.internal.UriFragmentChangedListener
import vaadin.scala.server.Page

class HelloScaladinUI extends UI {
  content = Button("Click me!", Notification.show("Hello, Scaladin!"))
}