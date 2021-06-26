<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Planes</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
</head>
<body>
<form:form id="planeform" action="addPlane" modelAttribute="plane">
Plane ID <form:input path='planeID'/><br/>
Model Name <form:input path='modelName'/><br/>
Plane Company <form:input path='planeCompany'/><br/>
Plane Capacity <form:input path='planeCapacity'/><br/>
Plane Type <form:input path='planeType'/><br/>
<c:forEach var="pilot" items="${plane.pilots}" >
    <table>
        <tr>
            <th>Name</th>
            <td><input type="text" value="${pilot.name}" /></td>
        </tr>
    </table>
</c:forEach>
<input type="submit" class="btn btn-primary" value="AddPlane"/>
</form:form>
</body>
</html>