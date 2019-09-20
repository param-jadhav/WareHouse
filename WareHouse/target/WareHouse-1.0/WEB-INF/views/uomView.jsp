<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>wel come to uom view </h3>
<table border="1">
<tr>
  <th>id</th>  <td>${ob.id}</td>
  
</tr>
<tr>
  <th>type</th>  <td>${ob.uomType}</td>
  
</tr>
<tr>
  <th>model</th>  <td>${ob.uomModel}</td>
  
</tr>
<tr>
  <th>note</th>  <td>${ob.description}</td>
  
</tr>



</table>
<a href ="excel"><img src="../resources/images/BulkExcel.png" width="50" height="80"></a>
<a href ="pdf"><img src="../resources/images/BulkPdf.png" width="50" height="80"></a>

</body>
</html>