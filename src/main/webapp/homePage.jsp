<%--
  Created by IntelliJ IDEA.
  User: egoparin
  Date: 31.01.2020
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<span style="color: ${cookie.color.value}">
    Hello
</span>

<form method="post" action="home">
    <label for="color">
        <select name="color" id="color">
            <option value="red">Red</option>
            <option value="black">Black</option>
            <option value="blue">Blue</option>
        </select>
    </label>
    <input type="submit" value="Color Send">
</form>
</body>
</html>
