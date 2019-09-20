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
			<div class="card-header bg-o" align="center">Welcome To OrderMthod Register Page</div>
			<div class="card-body bg-w">
				<div class="row">
					<div class="col-4">
						<label for="type">Order mode</label>
					</div>
						<div class="col-4">
						 <input type="radio" name="orderMode" id ="type"value="sale" checked> sale<br>
                         <input type="radio" name="orderMode" id ="type" value="puchase">purchase <br>
					</div>
					
				</div>
				<div class="row">
					<div class="col-4">
						<label for="model">Order Code</label>
					</div>
					<div class="col-4">
				<input type="text" name="orderCode" id="model" class="form-control">
			
						
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="desr">orderType</label>
					</div>
					<div class="col-4">
						<select name="orderType" id="desr" class="form-control">
							<option value="">-select-</option>
							<option value="fifo">fifo</option>
							<option value="lofo">lifo</option>
							<option value="fifo">fofo</option>
							<option value="fofo">fifo</option>
						</select>
						</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="mode"> orderAccpt</label>
					</div>
					<div class="col-4">
						 <input type="checkbox" name="orderAccpt" id="mode" value="model" checked >multi
                         <input type="checkbox" name="orderAccpt" id="mode"value="accept">
					</div>
				</div>
				
				
				
				<div class="row">
					<div class="col-4">
						<label for="descr">Description</label>
					</div>
					<div class="col-4">
						<textarea name="description"name="note" id="descr" class="form-control"></textarea>
					</div>
				</div>
								
				<div class="row">
					<div class="col-4" align="center">
                                <input type="submit" value="Register"></div>
					<div class="col-4">
					             <input type="reset" value="C L E A R"></div>
				</div>
			</div>
			<div class="card-footer bg-g" align="center">${mes}</div>
		</div>
	</div>	
</form>
</body>
</html>