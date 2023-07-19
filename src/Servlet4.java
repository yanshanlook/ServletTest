import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "Servlet4",urlPatterns = "/Servlet4")
public class Servlet4 extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        ServletContext context=this.getServletContext();
        Enumeration<String>paramNames=context.getInitParameterNames();
        out.println("all the paramName and paramValue are following:");
        while(paramNames.hasMoreElements()){
            String name=paramNames.nextElement();
            String value=context.getInitParameter(name);
            out.println(name+":"+value);
            out.println("<br/>");
        }

    }
}
