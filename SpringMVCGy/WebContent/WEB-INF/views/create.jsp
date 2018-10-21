<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Gym Member</title>
</head>
<body>

	<c:choose>
		<c:when test="${not empty gym}">

			<h3>Your Request Was Completed!</h3>

			<form action="home.do" method="GET">
				<input type="hidden" name="id" /> <br> <input type="submit"
					value="Main Menu" />
			</form>
		</c:when>


		<c:otherwise>
			<h3>Your Request Was Not Complete</h3>

			<form action="home.do" method="GET">
				<input type="hidden" name="id" /> <br> <input type="submit"
					value="Main Menu" />

			</form>
		</c:otherwise>
	</c:choose>

</body>
</html>