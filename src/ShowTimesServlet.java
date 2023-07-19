import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowTimesServlet",urlPatterns = "/ShowTimesServlet")
public class ShowTimesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        //获得Context
        ServletContext context = getServletContext();
        //从context中获取访问次数
        Integer times = (Integer) (context).getAttribute("times");
        if (times == null) {
            times = 1;
        } else {
            times = times + 1;
        }
        //设置编码
        response.setContentType("text/html;charset=UTF-8");
        //得到输出流对象
        PrintWriter out = response.getWriter();
        out.println("当前页面被访问了");
        out.println("<font color=red size=20>" + times + "</font>次");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }


}
