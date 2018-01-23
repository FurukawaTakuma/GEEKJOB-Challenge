<%-- 
    Document   : challenge7-1
    Created on : 2018/01/23, 13:06:10
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.HashMap"%>
<%
HashMap<String,String> data = new HashMap<String,String>();
data.put("1","AAA");
data.put("hello","world");
data.put("soeda","33");
data.put("20","20");
//out.print(data.get("hello"));helloというラベルの箱の中身を表示

out.print(data);
//data内の配列を表示
%>