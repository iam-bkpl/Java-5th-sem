<%-- 
    Document   : HandleSI
    Created on : Jan 27, 2023, 11:31:43 AM
    Author     : bkpl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
//             find smiple interest
            int ptr = Integer.parseInt(request.getParameter("p"));
            int tme = Integer.parseInt(request.getParameter("t"));
            int rte = Integer.parseInt(request.getParameter("r"));
         
            int si = 0;   
            
            si= (ptr*tme*rte)/100;
            
            out.println("<h1>Simple Interest = "+si+" </h1>");
        
        
        %>
            
            
    </body>
</html>
