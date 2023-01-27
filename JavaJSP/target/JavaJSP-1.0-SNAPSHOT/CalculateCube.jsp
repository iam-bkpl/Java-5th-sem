<%-- 
    Document   : CalculateCube
    Created on : Jan 27, 2023, 11:39:38 AM
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
       
        
        <jsp:useBean id="cubeObj" class="Bean.CubeFind" scope="session" />
        <%
            int num = Integer.parseInt(request.getParameter("num"));
            cubeObj.setNum(num);
            
            int result = cubeObj.getNum();
            out.println("Cube is "+ result);
        %>
    </body>
</html>
