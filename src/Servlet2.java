import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet2",urlPatterns = "/Servlet2")
public class Servlet2 extends HttpServlet {
    public void init(ServletConfig config)throws ServletException{
        System.out.println("init method is called");
    }
    public void service(ServletRequest request, ServletResponse response)
        throws ServletException{
        System.out.println("Hello World");
    }
    public void destroy(){
        System.out.println("destroy method is called");
    }

}
