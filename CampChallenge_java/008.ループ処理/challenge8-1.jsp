<%-- 
    Document   : challenge8-1
    Created on : 2018/01/23, 13:44:42
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
long total = 1;
    for(int i=0; i<20; i++){
        total= total * 8;
//total*=8;とも書ける
}
    out.print(total);
%>