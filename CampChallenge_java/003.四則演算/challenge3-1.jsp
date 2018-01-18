<%-- 
    Document   : challenge3-1
    Created on : 2018/01/18, 14:23:54
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    final int TEISU1 = 6;
    final int TEISU2 = 9;
    final int TEISU3 = 5;
    int HENSU1 = 3;
    int HENSU2 = 7;
    int HENSU3 = 4;

    out.print(TEISU1 + ++HENSU1 + "<br>");
    out.print(TEISU2 - --HENSU2 + "<br>");
    out.print(TEISU3 * HENSU3++ + "<br>");
    out.print(TEISU2 % HENSU3-- + "<br>");
    

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
