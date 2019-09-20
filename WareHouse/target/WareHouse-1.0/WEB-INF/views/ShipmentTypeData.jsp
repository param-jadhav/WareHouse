<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="excel">excel</a>
<a href="pdf">pdf</a>
<table border="1">
		<tr>
			<th>id</th>
			<th> shipmentMode</th>
			<th> shipmentCode</th>
			<th>shipmentEnable</th>
			<th>shipmentGrde</th>
			<th> description</th>
			<th colspan="3">option</th>
			
		</tr>
		
		<c:forEach items="${list}" var="ob">
			<tr>
				<td><c:out value="${ob.id}"/></td>
				<td><c:out value="${ob.shipmentMode}"/></td>
				<td><c:out value="${ob.shipmentCode}"/></td>
				<td><c:out value="${ob.shipmentEnable}"/></td>
				<td><c:out value="${ob.shipmentGrade}"/></td>
				<td><c:out value="${ob.description}"/></td>
				<td><a href="delete?id=${ob.id}">delete</a></td>
				<td><a href="edit?id=${ob.id}">edit</a></td>
				<td><a href="view?id=${ob.id}">view</a></td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>