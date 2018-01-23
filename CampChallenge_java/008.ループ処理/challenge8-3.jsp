<%-- 
    Document   : challenge8-3
    Created on : 2018/01/23, 14:41:56
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
    int total = 0;
    
    for(int i=0; i<101; i++){
//1から100までではなく0から100までなので101回繰り返す
        total+=i;
}
    out.print(total);
%>
