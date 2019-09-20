<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WelCome to Uom Edit Page</h3>
<form:form action="update" method="post" modelAttribute="ord">
<pre>
id:<form:input path="id" readonly="true" />
orderMode:
	  <form:radiobutton path="orderMode" value="sale" checked/> sale<br>
	  <form:radiobutton path="orderMode" value="sale" /> puchase<br>
      
 orderCode:
	<form:input path="orderCode"/>
	 orderType;<form:select path="orderType">
		                  <option value="">-select-</option>
							<form:option value="fifo">fifo</form:option>
							<form:option value="lofo">lifo</form:option>
							<form:option value="fifo">fofo</form:option>
							<form:option value="fofo">fifo</form:option>
	</form:select>
description:<form:textarea path="note"/>
orderAccpet:
            <form:checkbox path="orderAccpt" value="sale" checked/>yes<br>
	        <form:checkbox path="orderAccpt" value="purchase" checked/> no<br>
           <input type="submit" value="update">



</pre>
</form:form>
</body>
</html>