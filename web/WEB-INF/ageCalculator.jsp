<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 10:46:33 PM
    Author     : navjo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: <input type="number" name="ageNum"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${messages}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
