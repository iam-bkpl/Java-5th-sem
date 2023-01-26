
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleInterest extends HttpServlet {
    int p=0;
    int t=0;
    int r=0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            
                   RequestDispatcher rd = request.getRequestDispatcher("SimpleInterestForm.html");
                   int si = (p*t*r)/100;
                   out.print("Simple interest = "+si);
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            p = Integer.parseInt(request.getParameter("p"));
            t = Integer.parseInt(request.getParameter("t"));
            r = Integer.parseInt(request.getParameter("r"));
        }
    }
