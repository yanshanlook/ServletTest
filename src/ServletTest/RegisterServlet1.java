package ServletTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet",urlPatterns = "/RegisterServlet")
class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username=request.getParameter("username");
        String sex=request.getParameter("sex");
        String birth=request.getParameter("birth");
        String nation=request.getParameter("nation");
        String introduction=request.getParameter("introduction");
        PrintWriter out=response.getWriter();
        out.println("姓名:"+username);
        out.println("性别:"+sex);
        out.println("出生年月:"+birth);
        out.println("民族:"+nation);
        out.println("个人介绍:"+introduction);

    }
}
