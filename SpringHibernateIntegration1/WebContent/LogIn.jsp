<html>

<h1>LogIn Page:</h1>
<body>
<form action="login" method="post">
UserName: <input type="text" name="userName"/><br>
Password: <input type="password" name="password"/><br>
<input type="submit" value="LogIn"/>
<font color="red">${message}</font>
</form>
<% request.setAttribute("message", "");%>
</body>
</html>