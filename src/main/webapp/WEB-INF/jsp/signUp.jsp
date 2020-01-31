<%@ page import="ru.oparin.models.User" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head><title>Autorized</title></head>
<body>

<%
    ArrayList<User> users = (ArrayList<User>) request.getAttribute("usersFromServer");
%>
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
        <td><%= user.getId()%></td>
        <td><%= user.getName()%></td>
        <td><%= user.getBirthDay()%></td>
    </tr>
    <% } %>
</table>
</body>
</html>