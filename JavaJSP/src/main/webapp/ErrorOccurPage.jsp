<%-- 
    Document   : ErrorOccurPage
    Created on : Jan 27, 2023, 10:40:42 AM
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
          <h1>Program to show error</h1>
        <%@ page errorPage="ErrorPage.jsp" %>
        <%
        int i =0;
        int k = 10/i;
        %>
    </body>
</html>
