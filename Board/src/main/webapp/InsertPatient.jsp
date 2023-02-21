
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Data</title>
        <style>
            body{
                margin-left: 35%;
                align-items: center;
            }
            </style>
    </head>
    <body>
        <h1>Insert Data to JSP</h1>
        <form action="Authentication" method="POST" class='form'>
            <table>
                <tr>
                    <td>Patent Name</td>
                    <td><input type='text' name='name' /> </td>
                </tr>
                 <tr>
                    <td>Address</td>
                    <td><input type='text' name='address'/> </td>
                </tr>
                 <tr>
                    <td> Age</td>
                    <td><input type='number' name='age'/> </td>
                </tr>
                 <tr>
                    <td>Date of Admission</td>
                    <td><input type='text' name='doa'/> </td>
                </tr>
                
                 <tr>
                    <td>Room No</td>
                    <td><input type='text' name='roomNum'/> </td>
                </tr>
                 <tr>
                     <td><input type="submit" value='submit'/> </td>
                    <td><input type='reset' value='reset'/> </td>
                </tr>
            </table>

        </form>
    </body>
</html>