<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> welcome to shipment type</h3>
<table border="1">
<tr>
 <th>id</th>  <td>${ob.id}</td>
</tr>
<tr>
 <th>shipmentMode</th>  <td>${ob.shipmentMode}</td>
</tr>
<tr>
 <th>shipmentCode</th>  <td>${ob.shipmentCode}</td>
</tr>
<tr>
 <th>shipmentEnable</th>  <td>${ob.shipmentEnable}</td>
</tr>
<tr>
 <th>shipmentGrade</th>  <td>${ob.shipmentGrade}</td>
</tr>
<tr>
 <th>description</th>  <td>${ob.description}</td>
</tr>



</table>
<a href="excel?id=${ob.id}">excel</a>
<a href="pdf?id=${ob.id}">pdf</a>
</body>
</html>