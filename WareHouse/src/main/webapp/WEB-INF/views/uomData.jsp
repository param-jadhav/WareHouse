  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href ="excel"><img src="../resources/images/BulkExcel.png" width="50" height="80"></a>
<a href ="pdf"><img src="../resources/images/BulkPdf.png" width="50" height="80"></a>
	<table border="1">
		<tr>
			<th>id</th>
			<th>uomType</th>
			<th>uomModel</th>
			<th>description</th>
			<th colspan="3">option</th>
		</tr>
		
		<c:forEach items="${list}" var="ob">
			<tr>
				<td><c:out value="${ob.id}"/></td>
				<td><c:out value="${ob.uomType}"/></td>
				<td><c:out value="${ob.uomModel}"/></td>
				<td><c:out value="${ob.description}"/></td>
				
				<td><a href="delete?id=${ob.id}"><img src="../resources/images/delete.png" width="30" height="50"></a></td>
				<td><a href="edit?id=${ob.id}"><img src="../resources/images/edit.png" width="30" height="50"></a></td>
				<td><a href="view?id=${ob.id}"><img src="../resources/images/view.png" width="30" height="50"></a></td>
				
				
			</tr>
		</c:forEach>

	</table>
	${mes}


</body>
</html>