import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTest",urlPatterns = "/ServletTest")//注解属性
public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        for(int j=1;j<=9;j++) {
            for(int i=1;i<=j;i++) {
                out.print(i+"*"+j+"="+(j*i)+"\t");
            }
            out.println();
        }

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
