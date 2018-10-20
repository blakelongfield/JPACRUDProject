<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of all Gym Members</title>
</head>
<body>

	<h2>List of all Gym Members</h2>

	<c:forEach items="${gymMembers}" var="gym">

		<p>ID: ${gym.id}</p>
		<p>Name: ${gym.firstName} ${gym.lastName}</p>
		<hr>

	</c:forEach>
	
	<form action="home.do" method="GET">
		<input type="hidden" name="id" /> <br> 
		<input type="submit" value="Main Menu" />
	</form>

</body>
</html>