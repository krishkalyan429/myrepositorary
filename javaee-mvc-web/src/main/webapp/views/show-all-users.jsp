<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h2>Users List</h2>

		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>UserId</th>
					<th>User Name</th>
					<th>Email</th>
					<th>Mobile</th>										
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${userList}">
					<tr class="success">
						<td>${c.id}</td>
						<td>${c.userId}</td>
						<td>${c.userName}</td>
						<td>${c.email}</td>
						<td>${c.mobile}</td>						
						<td><a href="edituser?id=${c.id}">edit</a></td>
						<td><a href="deleteuser?id=${c.id}">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>