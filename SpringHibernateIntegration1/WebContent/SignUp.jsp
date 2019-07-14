<html>

<h1>SignUp Page:</h1>


<body>
<form action="saveSignUpData" method="post">
Name: <input type="text" name="name"/><br>
UserName: <input type="text" name="userName"/><br>
Password: <input type="password" name="password"/><br>
<input type="submit" value="SignUp"/>
<a href="LogIn.jsp">LogIn</a>
<font color="red">${message}</font>
</form>
<% request.setAttribute("message", "");%>
</body>
</html>