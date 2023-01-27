<%-- 
    Document   : FetchCustomer
    Created on : Jan 27, 2023, 1:34:16 PM
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
        <!--<h1>Customer Data</h1>-->
        <jsp:useBean id="customer" class="Bean.Customer" scope="session" />
     
        
        <jsp:setProperty name="customer" property="name" value="<%= request.getParameter("name") %>"  />
        <jsp:setProperty name="customer" property="address" value="<%= request.getParameter("address") %>"  />
        <jsp:setProperty name="customer" property="contact" value="<%= request.getParameter("contact") %>"  />
        <jsp:setProperty name="customer" property="email" value="<%= request.getParameter("address") %>"  />
        
        
        <h1>Collected data</h1>
        <a href="ProcessCustomer" >Get Customer info</a>
    </body>
</html>