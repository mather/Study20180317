package com.github.mather.study20180317

import com.github.mather.study20180317.application.ItemApplication
import org.scalatra.ScalatraServlet

class MyScalatraServlet extends ScalatraServlet {

  val application = new ItemApplication

  get("/") {
    views.html.index(application.showItems)
  }

  get("/:id") {
    views.html.detail(application.showItem(params("id").toInt))
  }

}
