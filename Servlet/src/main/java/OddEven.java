
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OddEven extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            /* TODO output your page here. You may use following sample code. */
          
                   RequestDispatcher rd = request.getRequestDispatcher("OddEvenForm.html");

                    rd.forward(request, response);
           
        }
       protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            /* TODO output your page here. You may use following sample code. */
          
         int num1 = Integer.parseInt(request.getParameter("num1"));
         if(num1 % 2 == 0){
             out.println("Even");
            
         }else{
             out.println("Odd");
         }
           
        }
    
   
}