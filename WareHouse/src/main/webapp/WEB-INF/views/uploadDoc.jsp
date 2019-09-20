<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
 <head>  
 <title>Image File Upload</title>  
 </head>  
 <body>  
<form action="upload" method="POST" enctype="multipart/form-data">
<pre>
id<input type="text" name="fid"><br>
doc<input type="file" name="fdoc">
<input type="submit" value="upload">



</pre>



</form>  
</body>  
</html>  