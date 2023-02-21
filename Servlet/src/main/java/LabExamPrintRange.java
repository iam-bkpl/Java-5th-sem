

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LabExamPrintRange extends HttpServlet {


//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//           try (PrintWriter out = response.getWriter();
//    }



  protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
   
      PrintWriter out = response.getWriter();
      int num1 =Integer.parseInt( request.getParameter("num1"));
      int num2 =Integer.parseInt( request.getParameter("num2"));
      
      for(int i = num1; i <= num2; i++){
          out.println(i);
      }
      
 }

   

}
