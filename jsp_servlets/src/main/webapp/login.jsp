<%--
  Created by IntelliJ IDEA.
  User: egoparin
  Date: 31.01.2020
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.oparin.models.User, java.util.ArrayList" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Autorized.</title>
</head>
<body>

<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>

<form method="post" action="/login">
    <label for="name"> User name
        <input type="text" id="name" name="name">
    </label>
    <label for="name"> User password
        <input type="password" id="password" name="password">
    </label>
    <input type="submit" value="Login in" >
</form>

</body>
</html>
