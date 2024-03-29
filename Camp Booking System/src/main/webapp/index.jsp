<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" 
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" 
	crossorigin="anonymous">
	<style>
		*{ 
			padding-left:0;
			margin:0;
			box-sizing: border-box;
		}
		body{
			background:#D8D8D8;
		
			
		}
		.row{
			background: white;
			border-radius: 30px;
			
			
			
			
			
		}
		img{
			border-top-left-radius: 30px;
			border-bottom-left-radius: 30px;
			
			
			
		}
		.btn1{
			border:none; 
			outline:none;
			height:50px;
			width: 100%;
			background-color: black;
			color: white;
			border-radius: 4px;
			font-weight:bold;
		}
		.btn1:hover{
			background: white;
			border: 1px solid;
			color: black;
		}
	</style>
</head>
<body>
	<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
	<section class="Form my-4 mc-5">
	<div class="container">
		<div class="row">
			<div class="col-lg-5">
				<img src="img.jpg" class="img-fluid" alt="">
			</div>
		<div class="col-lg-7 px-5 pt-5"  >
			<h1 class="font-weight-bold py-3" >Camp Booking</h1>
			<h4>Sign into your account</h4>
			<form action="login" method="post">
				<div class="form-row">
					<div class="col-lg-7">
						<input type="email" placeholder="Email-Address" class="form-control mt-5 my-3 p-4" name="participant_email">
					</div>
				</div>
				<div class="form-row">
					<div class="col-lg-7">
						<input type="password" placeholder="********" class="form-control my-3 p-4" name="participant_password">
					</div>
				</div>
				<div class="form-row">
					<div class="col-lg-7">
						
						<input type="submit" class="btn1 mt-3 mb-5" value="LOGIN">
					</div>
				</div>
				<a href="#" onclick="window.location.href='LoginStaff.jsp';">Admin Login</a>
				<p>Don't have account?<a onclick="window.location.href='CreateAcc.jsp';" href="#">Register here</a></p>
			</form>
		</div>
		</div>
	</div>
	
	</section>
	
	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if(status == "failed"){
			alert("You have entered invalid email or password. Please enter again.");
		}
	</script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>