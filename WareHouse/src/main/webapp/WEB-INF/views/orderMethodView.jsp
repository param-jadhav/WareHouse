<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> wel come to order method view page</h3>
<table border= "2">
<tr>
 <th>id</th>  <td>${ob.id}</td>
</tr>
<tr>
 <th>orderMode</th>  <td>${ob.orderMode}</td>
 </tr>
 <tr>
  <th>orderCode</th>  <td>${ob.orderCode}</td>
  </tr>
  <tr>
   <th>ordertype</th>  <td>${ob.orderType}</td>
   </tr>
   <tr>
    <th>note</th>  <td>${ob.note}</td>
    </tr>
    


</table>
<a href="excel?id=${ob.id}">excel</a>
<a href="pdf?id=${ob.id}">pdf</a>
 
</body>
</html>