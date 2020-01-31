<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="ru.oparin.models.User, java.util.ArrayList" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Autorized. Добро пожаловать, JSP!</title>
</head>
<body>

<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>
<form method="post" action="signUp">
    <label for="name"> User id
        <input type="text" id="id" name="id">
    </label>
    <label for="name"> User name
        <input type="text" id="name" name="name">
    </label>
    <label for="name"> User password
        <input type="password" id="password" name="password">
    </label>
    <label for="name"> User birthDay
        <input type="text" id="birthDay" name="birthDay">
    </label>
    <input type="submit" value="signUp">

</form>
<table>
    <tr>
        <th>User id</th>
        <th>User name</th>
        <th>User birthday</th>
    </tr>
    <%
        for (User user : users) {
    %>
    <tr>
        <td><%= user.getId()%>
        </td>
        <td><%= user.getName()%>
        </td>
        <td><%= user.getBirthDay()%>
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>