import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet3",urlPatterns = "/Servlet3",
initParams = {@WebInitParam(name ="encoding",value = "UTF-8")})
public class Servlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        ServletConfig config=this.getServletConfig();
        String param=config.getInitParameter("encoding");
        out.println("encoding="+param);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
