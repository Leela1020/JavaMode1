<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>Manager Requests</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	list-style: none;
	text-decoration: none;
	font-family: 'Josefin Sans', sans-serif;
}

body {
	background-color: white;
}

.wrapper {
	display: flex;
	position: relative;
}

.wrapper .sidebar {
	width: 200px;
	height: 100%;
	background: #4b4276;
	padding: 30px 0px;
	position: fixed;
}

.wrapper .sidebar h2 {
	color: #fff;
	text-transform: uppercase;
	text-align: center;
	margin-bottom: 30px;
}

.wrapper .sidebar ul li {
	padding: 15px;
	border-bottom: 1px solid #bdb8d7;
	border-bottom: 1px solid rgba(0, 0, 0, 0.05);
	border-top: 1px solid rgba(255, 255, 255, 0.05);
}

.wrapper .sidebar ul li a {
	color: #bdb8d7;
	display: block;
}

.wrapper .sidebar ul li a .fas {
	width: 25px;
}

.wrapper .sidebar ul li:hover {
	background-color: #594f8d;
}

.wrapper .sidebar ul li:hover a {
	color: #fff;
}

.wrapper .main_content {
	width: 90%;
	margin-left: 200px;
}

.wrapper .main_content .header {
	padding: 20px;
	background: #fff;
	color: #717171;
	border-bottom: 1px solid #e0e4e8;
	margin: 10px 200px;
}

.wrapper .main_content .info {
	margin: 20px;
	color: #717171;
	line-height: 25px;
}

.wrapper .main_content .info div {
	margin-bottom: 20px;
}

.res {
	color: green;
}
</style>
</head>
<body>
	<div class="wrapper">
		<div class="sidebar">
			<ul>
				<li><a href="SuccessAdmin" style="text-decoration: none;"><i class="fas fa-home"></i>Home</a></li>
            <li><a href="AddingOfPilots" style="text-decoration: none;"><i class="fas fa-user"></i>Add a Pilot</a></li>
            <li><a href="DisplayPilots" style="text-decoration: none;"><i class="fas fa-user"></i>View Pilots</a></li>
            <li><a href="displayPlanes" style="text-decoration: none;"><i class="fas fa-user"></i>View Planes</a></li>
            <li><a href="DisplayHangars" style="text-decoration: none;"><i class="fas fa-user"></i>View Hangars</a></li>
            <li><a href="AddingOfPlanes" style="text-decoration: none;"><i class="fas fa-user"></i>Add a Plane</a></li>
            <li><a href="AddingHangars" style="text-decoration: none;"><i class="fas fa-user"></i>Add a Hangar</a></li>
            <li><a href="RequestApprover" style="text-decoration: none;"><i class="fas fa-user"></i>Manager Requests</a></li>
            <li><a href="Home.jsp" style="text-decoration: none;"><i class="fas fa-user"></i>Logout</a></li>
			</ul>
		</div>

		<div class="main_content">
			<h1 align="center" class="header">Approver Details</h1>

			<table width="900" border="0" style="background-color: white;">
				<tr>
					<th>UserID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Approve</th>
					<th>Delete</th>
				</tr>
				<tr />
				<tr />
				<tr />
				<tr />
				<tr />
				<tr />

				<c:forEach var="x" items="${userList}">
					<tr>
						<td align="center"><c:out value="${x.userID}"></c:out></td>
						<td align="center"><c:out value="${x.firstName}"></c:out></td>
						<td align="center"><c:out value="${x.lastName}"></c:out></td>
						<td align="center"><a href="approveRequest/${x.userID}" onclick="Validate();">Approve</a></td>
						<td align="center"><a href="deleteRequest/${x.userID}" onclick="Validate();">Delete</a></td>
					</tr>
					<br>
					<tr />
					<tr />
					<tr />
					<tr />
					<tr />
					<tr />
				</c:forEach>
			</table>
			<br> <br>
			<div class="alert alert-success">
				<h4 class="res" align="center">
					<c:out value="${result}"></c:out>
				</h4>
			</div>
			<script type="text/javascript">
				$(document).ready(function() {
					window.setTimeout(function() {
						$(".alert").fadeTo(1000, 0).slideUp(1000, function() {
							$(this).remove();
						});
					}, 2000);

				});
			</script>

		</div>
	</div>

</body>
</html>