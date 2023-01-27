
package Bean;

import java.io.*;
//import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class ProcessCustomer extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            
            String message = "";
            
            HttpSession session = request.getSession(true);
            Customer customer = (Customer)session.getAttribute("customer");
            
            String name = customer.getName();
            String address = customer.getAddress();
            String contact = customer.getContact();
            String email = customer.getEmail();
            
            out.println(name + " "+ address + " "+ contact + " " + email );
        }
    }
