<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
	<style type="text/css">
		.bg-o{background-color: orange}
		.bg-b{background-color: blue}
		.bg-p{background-color: pink}
		.bg-w{background-color: white}
		.bg-y{background-color: yellow}
		.bg-c{background-color: cyan}
		.bg-g{background-color: green}
	</style>
</head>
<body>
<form action="save" method="POST">
	<div class="container">
		<div class="card">
			<div class="card-header bg-o" align="center">Welcome To Shipment Register Page</div>
			<div class="card-body bg-w">
				<div class="row">
					<div class="col-4">
						<label for="type">Shipment mode</label>
					</div>
					<div class="col-4">
						<select name="shipmentMode" id="type" class="form-control">
							<option value="">-select-</option>
							<option value="air">air</option>
							<option value="truck">track</option>
							<option value="ship">ship</option>
							<option value="train">train</option>
						</select>
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="model">shipment Code</label>
					</div>
					<div class="col-4">
						<input type="text" name="shipmentCode" id="model" class="form-control">
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="desr">shipmentEnable</label>
					</div>
					<div class="col-4">
						<select name="shipmentEnable" id="desr" class="form-control">
							<option value="">-select-</option>
							<option value="yes">yes</option>
							<option value="no">no</option>
						</select>				
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="model"> shipmentGrade</label>
					</div>
					<div class="col-4">
						 <input type="radio" name=" shipmentGrade" value="A" checked> A<br>
                         <input type="radio" name=" shipmentGrad" value="B">b <br>
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="descr">Description</label>
					</div>
					<div class="col-4">
						<textarea name="description"name="description" id="descr" class="form-control"></textarea>
					</div>
				</div>
				
				
				<div class="row">
					<div class="col-4" align="center"><input type="submit" value="Register"></div>
					<div class="col-4"><input type="reset" value="C L E A R"></div>
				</div>
			</div>
			<div class="card-footer bg-g" align="center">${mes}</div>
		</div>
	</div>	
</form>
</body>
</html>