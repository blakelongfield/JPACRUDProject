<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gym Member Details</title>
</head>
<body>
	
	<c:choose>
	<c:when test="${not empty gym}"> 

		<div>
			<h3>${gym.firstName} ${gym.lastName}</h3>
			<p>Classes Attended: ${gym.classesAttended}</p>
			<p>Favorite Equipment: ${gym.favoriteEquipment}</p>
			<p>Age: ${gym.age}</p>
			<p>Gender: ${gym.gender}</p>
			<p>Weight: ${gym.weight} pounds</p>
		</div>
		
		<form action="updateGymMember.do" method="GET">
			<input type="hidden" name="id" value="${gym.id}" /> 
			<input type="submit" value="Update" />
		</form>

		<form action="deleteGymMember.do" method="GET">
			<input type="hidden" name="id" value="${gym.id}" /> 
			<input type="submit" value="Delete" />
		</form>
		<br><br>
		<form action="home.do" method="GET">
			<input type="hidden" name="id" />
			<input type="submit" value="Main Menu" />
		</form>
	</c:when>

	<c:when test="${not empty gymMembers}"> 
	
		<c:forEach items="${gymMembers}" var="gym">

		<div>
			<h3>${gym.firstName} ${gym.lastName}</h3>
			<p>Classes Attended: ${gym.classesAttended}</p>
			<p>Favorite Equipment: ${gym.favoriteEquipment}</p>
			<p>Age: ${gym.age}</p>
			<p>Gender: ${gym.gender}</p>
			<p>Weight: ${gym.weight} pounds</p>
			<hr>
		</div>
		
		</c:forEach>

		<form action="home.do" method="GET">
			<input type="hidden" name="id" /> <br> <input type="submit"
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