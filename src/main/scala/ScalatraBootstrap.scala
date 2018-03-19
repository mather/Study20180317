import com.github.mather.study20180317._
import org.scalatra._
import javax.servlet.ServletContext

import com.github.mather.study20180317.MyScalatraServlet

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new MyScalatraServlet, "/*")
  }
}
