<%-- 
    Document   : arithmeticCalculator
    Created on : 25-Sep-2022, 10:53:01 PM
    Author     : navjo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" action="post">
            First: <input type="number" name="firstNum">
            Second: <input type="number"  name="secondNum"><br>
            <input type="submit" name="plus" value="+">
            <input type="submit" name="subtract" value="-">
        </form>
            <p>${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
