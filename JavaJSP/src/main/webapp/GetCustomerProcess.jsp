<%-- 
    Document   : GetCustomerProcess
    Created on : Jan 27, 2023, 9:58:23 PM
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
        <h1>Get</h1>
        <jsp:useBean id="customer" class="Bean.Customer" scope="session" />
        
        <jsp:getProperty name="customer" property="name"/>
         <jsp:getProperty name="customer" property="address"/>
          <jsp:getProperty name="customer" property="contact"/>
           <jsp:getProperty name="customer" property="email"/>
         
    </body>
</html>
