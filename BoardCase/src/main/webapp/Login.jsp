<%-- 
    Document   : Login
    Created on : Feb 21, 2023, 1:15:29 PM
    Author     : bkpl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
          <style>
            body{
                margin-left: 35%;
                align-items: center;
                align-items: center;

            }
            </style>
    </head>
    <body>
        <h1>Enter Your login information</h1>
        <form action="HB" method="POST"  class='form'>
            <table>
                <tr>
                    <td> Username:</td>
                    <td> <input type='text' name='username'/></td>
                </tr>
                <tr>
                    <td> Password:</td>
                    <td> <input type ='password' name='password'/></td>
                </tr>
                 <tr>
                    <td>  <input type='submit' value='login'/></td>
                    <td>  <input type='reset' value='cancel'/></td>
                </tr>
            </table>

           
           
        </form>
    </body>
</html>
