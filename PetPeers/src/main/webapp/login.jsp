<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="background-color:grey;">
<p> Welcome to the Login Page!</p>
<p>Login</p>
<form action="LoginServlet" method="post">
<p>Name</p>
<input type="text"  name="name" required><br/>
<p>Password<p/>
<input type="password" name="password" required><br/> 
<p><input type="submit" value="login"></p>
</form>
</body>
</html>