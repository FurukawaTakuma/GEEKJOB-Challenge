<%-- 
    Document   : challenge6-2
    Created on : 2018/01/19, 14:56:42
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<String> data1 = new ArrayList <String>();
data1.add("10");
data1.add("100");
data1.add("soeda");
data1.add("hayashi");
data1.add("-20");
data1.add("118");
data1.add("END");

data1.set(2,"33");
%>