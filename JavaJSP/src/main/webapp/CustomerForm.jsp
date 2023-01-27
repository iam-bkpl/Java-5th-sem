<%-- 
    Document   : CustomerForm
    Created on : Jan 27, 2023, 12:38:18 PM
    Author     : bkpl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <h1>Customer Form</h1>
        <form class="container" action="FetchCustomerForm.jsp" method="POST"> 
            <label>Name</label> 
            <input type="text" class="form-control" name="name"/>
            <label>Address</label> 
            <input type="text" class="form-control" name="address"/>
            <label>Contact</label> 
            <input type="text" class="form-control" name="contact"/>
            <label>Email</label> 
            <input type="email" class="form-control" name="email"/>
            <input type="submit"  value ="submit" class="btn btn-primary"/>
</form>
    </body>
</html>
