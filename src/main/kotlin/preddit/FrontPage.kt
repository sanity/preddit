package preddit

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class FrontPageServlet : HttpServlet() {

    protected override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.setContentType("text/plain")
        resp.getOutputStream()!!.println("It works!")
    }
}