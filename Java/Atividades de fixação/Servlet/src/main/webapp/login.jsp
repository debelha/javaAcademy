<%--
  Created by IntelliJ IDEA.
  User: Deborah
  Date: 08/07/2024
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
    <body>
        <form action="login" method="post">

            <label for="email">E-mail:</label>
                <input type="email" id="email" name="email" required/>
                <br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required/>
            <br>

            <button type="submit">Login</button>
        </form>
</body>
</html>
