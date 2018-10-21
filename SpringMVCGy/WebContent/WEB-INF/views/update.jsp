<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update a Gym Member</title>
</head>
<body>

	<h3>Update a Gym Member</h3>

	<c:choose>
		<c:when test="${not empty gym}">

			<form action="update.do" method="POST">

				<p>Gym Member ID: ${gym.id}</p>

					ID: <input type="hidden" name="id" value="${gym.id}" /> 
					
					First Name: <input type="text" name="firstName" value="${gym.firstName}" />
					<br> 
					
					Last Name: <input type="text" name="lastName" value="${gym.lastName}" /> 
					<br>
					
					<!-- add a drop down menu or a jsp to show all classes available -->
					Classes Attended: <input type="text" name="classesAttended" value="${gym.classesAttended}" /> 
					<br>

					<!-- add a drop down menu or a jsp to show all equipment -->
					Favorite Equipment: <input type="text" name="favoriteEquipment" value="${gym.favoriteEquipment}" /> 
					<br>

					<!-- Error at over 100 and under 16 -->
					Age: <input type="text" name="age" value="${gym.age}" /> 
					<br>

					<!-- Error if not M or F -->
					Gender: <input type="text" name="gender" value="${gym.gender}" />
					<br>

					<!-- Take in a double? -->
					Weight: <input type="number" step="any" name="weight" value="${gym.weight}" />
					<br> 
					
					<input type="submit" value="Submit" value="Enter an ID"/>
			</form>

			<form action="home.do" method="GET">
				<input type="hidden" name="id" value=""/> <br> <input type="submit"
					value="Main Menu" />
			</form>

		</c:when>

		<c:otherwise>
			<p>No Member found</p>

			<form action="home.do" method="GET">
				<input type="hidden" name="id" /> <br> <input type="submit"
					value="Main Menu" />

			</form>
		</c:otherwise>

	</c:choose>

</body>
</html>