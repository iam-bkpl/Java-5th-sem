<%-- 
    Document   : SumToN
    Created on : Jan 27, 2023, 10:55:01 AM
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
        <h1>sum on N natural number t.</h1>
        <form method="POST" action="HandleSumToN.jsp">
          Find sum to num and check odd or even and Find Factorial
            <br> 
            N = <input typ="number" name="N" />
            <br>
            <p>Check the maximum number </p>
            Num1 =  <input type="number" name="num1"/><br>
            Num2 = <input type="number" name="num2"/><br>
            Num3 = <input type="number" name="num3"/><br>
            <input type="submit" value="Submit"/>
</form>
        <form method="POST" action="HandleSI.jsp">
            <p>Find simple interest </p>
            Principle =  <input type="number" name="p"/><br>
            Time = <input type="number" name="t"/><br>
            Rate = <input type="number" name="r"/><br>
            <input type="submit" value="Submit"/>
            </form>
            
     
    </body>
</html>
