<%-- 
    Document   : challenge5-2
    Created on : 2018/01/19, 10:42:56
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
int num = 3;

switch(num){
    case 1:
        out.print("one");
        break;
    case 2:
        out.print("two");
        break;
    default:
        out.print("想定外");
        break;
}
%>