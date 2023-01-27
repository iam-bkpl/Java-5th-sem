<%-- 
    Document   : DisplayCurrentDate
    Created on : Jan 27, 2023, 10:16:06 AM
    Author     : bkpl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Current Date</title>
    </head>
    <body>
        <h1>Current Date:</h1>
        <jsp:useBean id="date" class="java.util.Date" />
        <p>The date and time is <%=date %> </p>
    </body>
</html>
