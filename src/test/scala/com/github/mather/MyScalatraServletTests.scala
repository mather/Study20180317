package com.github.mather

import com.github.mather.study20180317.MyScalatraServlet
import org.scalatra.test.scalatest._

class MyScalatraServletTests extends ScalatraFunSuite {

  addServlet(classOf[MyScalatraServlet], "/*")

  test("GET / on MyScalatraServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
