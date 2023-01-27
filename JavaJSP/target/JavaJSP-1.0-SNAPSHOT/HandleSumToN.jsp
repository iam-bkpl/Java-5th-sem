<%-- 
    Document   : HandleSumToN
    Created on : Jan 27, 2023, 10:58:14 AM
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
        <h1>Get your result here</h1>
        <% 
//            sum to n no 
            int n = Integer.parseInt(request.getParameter("N"));
            
//            find max 
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int num3 = Integer.parseInt(request.getParameter("num3"));
            
//       
           int sum=0;
           int fact=1;
           
          
           
            for(int i = 0; i<=n; i++){
            sum += i;
            }
            out.println("<h1>The sum from 0 to" + n + " = "+  sum);
          
            if(n%2==0){
            out.println("<h1>Even</h1>");
            }else{
             out.println("<h1>Odd</h1>");
            }
            for(int i = 1; i<=n; i++){
            fact *= i;
            }
             out.println("<h1>Factorial = "+fact+"</h1>");
             
             if(num1 > num2 && num1 > num3 ){
             out.println("<h1>MaX = "+ num1+" </h1>");
            }
            else if(num2 > num1 && num2 > num3){
            out.println("<h1>MaX = "+ num2+" </h1>");
            }else if(num3 > num1 && num3 > num2){
            out.println("<h1>MaX = "+ num3+" </h1>");
            }else{
            out.println("<h1>Something went wrong </h1>");
            }
            

            
        %>
    </body>
</html>
