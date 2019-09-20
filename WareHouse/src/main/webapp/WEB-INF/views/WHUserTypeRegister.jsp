<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

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
<form action="#" method="POST">
	<div class="container">
		<div class="card">
			<div class="card-header bg-o" align="center">Welcome To OrderMthod Register Page</div>
			<div class="card-body bg-w">
				<div class="row">
					<div class="col-4">
						<label for="type">User Type</label>
					</div>
						<div class="col-4">
						 <input type="radio" name="userType" id ="type"value="vender" checked> vender<br>
                         <input type="radio" name="userType" id ="type" value="customer">Customer <br>
					</div>
					
				</div>
				<div class="row">
					<div class="col-4">
						<label for="model">User Code</label>
					</div>
					<div class="col-4">
				<input type="text" name="userCode" id="model" class="form-control">
			
						
					</div>
				</div>
				
				<div class="row">
					<div class="col-4">
						<label for="mode">userfor</label>
					</div>
					<div class="col-4">
					<input type="text" name="userFor" id="mode" class="form-control">
			
						 
					</div>
				</div>
					<div class="row">
					<div class="col-4">
						<label for="descr">User Contact</label>
					</div>
					<div class="col-4">
						<input type="text" name="userContact" id="descr" class="form-control">
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="desr">User ID</label>
					</div>
					<div class="col-4">
						<select name="userId" id="desr" class="form-control">
							<option value="">-select-</option>
							<option value="PAN">PAN CARD</option>
							<option value="ADHAR">ADHAR CARD</option>
							<option value="VOTER">VOTERID</option>
							<option value="OTHER">OTHER </option>
						</select>
						</div>
				</div>
				<div class="row">
					<div class="col-4">
						<label for="des">ID number</label>
					</div>
					<div class="col-4">
						<input type="text" name="userId" id="des" class="form-control">
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