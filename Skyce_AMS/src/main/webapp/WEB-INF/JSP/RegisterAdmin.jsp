<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
</head>
<body>
<form:form id='userform' action="registerAdmin" modelAttribute="user">
First Name<form:input path='firstName'/><br/>
Last Name<form:input path='lastName'/><br/>
Age<form:input path="age"/>
Gender<form:radiobutton path="gender" value="Male"/>
<form:radiobutton path="gender" value="Female"/>
<form:radiobutton path="gender" value="Other"/>
Email<form:input path="email"/><br/>
Password<form:password path="password"/><br/>
PIN:<form:input path="address.PIN"/><br/>
City:<form:input path="address.city"/><br/>
State:<form:input path="address.state"/><br/>
Country:<form:input path="address.country"/><br/>
Street:<form:input path="address.street"/><br/>
Door No:<form:input path="address.doorNo"/><br/>
<input type="submit" class="btn btn-primary" value="Register"/>
</form:form>
</body>
</html>