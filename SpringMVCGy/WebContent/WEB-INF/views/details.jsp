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
	
	<!-- Why is this not working??? along with otherwise -->
	<%-- <c:when test="${not empty gymMemberDetails}"> --%>

		<div>
			<h3>${gym.firstName}${gym.lastName}</h3>
			<p>Classes Attended: ${gym.classesAttended}</p>
			<p>Favorite Equipment: ${gym.favoriteEquipment}</p>
			<p>Age: ${gym.age}</p>
			<p>Gender: ${gym.gender}</p>
			<p>Weight: ${gym.weight} pounds</p>
			<p>Height: ${gym.height}</p>
		</div>

		<form action="home.do" method="GET">
			<input type="hidden" name="id" /> <br> <input type="submit"
				value="Main Menu" />
		</form>

		<%-- <c:otherwise>
			<p>No Member found</p>
		</c:otherwise>

	</c:when> --%>

</body>
</html>