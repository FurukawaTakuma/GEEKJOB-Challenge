<%-- 
    Document   : SESSION[2]
    Created on : 2018/03/05, 11:21:15
    Author     : guest1Day
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String rsname = "";
    String rsgendar = "";
    String rshby = "";
    if ((String) session.getAttribute("rsname") != null || (String) session.getAttribute("gnd") !=null || (String) session.getAttribute("hby") != null) {
        rsname = (String) session.getAttribute("rsname");
        rsgendar = (String) session.getAttribute("gnd");
        rshby = (String) session.getAttribute("hby");
    }
 


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action = "/Challenge/SESSION2" method = "get">
            名前
            <input type="text" name="name" value =<%if (rsname != null) {
                    out.print(rsname);
                }%>>
            <br><br>

            性別<br>
            <input type="radio" name="gendar" value="male" <%if (rsgendar.equals("male")) {out.print("checked");}%>>男性
            <%-- <input type="radio" name="gendar" value="male" <%if(rsgendar.equals("male")){(%>checked<%);}%>>男性--%>
            <input type="radio" name="gendar" value="female"<%if (rsgendar.equals("female")) {out.print("checked");}%>>女性
            <br><br>

            趣味
            <textarea name="hobby"><%if (rshby != null) {
                    out.print(rshby);
                }%></textarea>
            <br><br>
            <input type="submit" name="submit" value="送信">
        </form>
    </body>
</html>
