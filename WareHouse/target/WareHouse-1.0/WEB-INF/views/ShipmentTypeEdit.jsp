<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert t+++itle here</title>
</head>
<body>
	<h3>WelCome to Uom Edit Page</h3>
<form:form action="update" method="post" modelAttribute="uom">
<pre>
id:<form:input path="id" readonly="true" />
shipmentType:<form:select path="shipmentMode">
		                    <form:option value="">-select-</form:option>
							<form:option value="air">air</form:option>
							<form:option value="truck">track</form:option>
							<form:option value="ship">ship</form:option>
							<form:option value="train">train</form:option>
	</form:select>
shipmentCode:<form:input path="shipmentCode"/>
shipmentEnable:<form:select path="shipmentEnable">
		       <form:option value="">-select-</form:option>
			   <form:option value="yes">yes</form:option>
			   <form:option value="no">no</form:option>
  </form:select>
  shipmentGrade:
               <form:checkbox path="shipmentGrade" value="a"/>a<br>
	           <form:checkbox path="shipmentGrade" value="b"/>b<br>
	           

description:   <form:textarea path="description"/>

<input type="submit" value="update">



</pre>
</form:form>
</body>
</html>