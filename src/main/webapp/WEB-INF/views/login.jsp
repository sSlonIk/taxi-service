<%@ page contentType="text/html;charset=UTF-8" %>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Sign in:</h1>
<h4 style="color:red">${errorMessage}</h4>
<form method="post" action="${pageContext.request.contextPath}/login">
    Please your login : <input type="text" name="login" required>
    Please your password :<input type="password" name="password" required>
    <button type="submit">Log In</button>
</form>
<h3><a href="${pageContext.request.contextPath}/drivers/add">Register Driver</a></h3>
</body>
</html>
