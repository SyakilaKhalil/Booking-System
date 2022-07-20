<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" 
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" 
	crossorigin="anonymous">
	<style>
	body{
		margin:0;
		padding:0;
		backgroud:#fff;
		font-family:'Raleway', sans-serif;	
		color:#fff;
	}
	.banner{
		height:100vh;
		width: 100%;
		background:url('img3.jpeg');
		background-position:center;
		background-size:cover;
		background-repeat: no-repeat;
	}
	.banner .navbar{
		margin-top:2%;	
	}
	.banner .navbar-brand{
		color:#fff;	
		font-size:22px;
		font-weight:700;
		margin-left:10%;
	}
	.banner .nav{
		margin-right:10%;	
	}
	.banner .nav li a{
		color:#aaa;
	 	font-size:1.2em;
	}
	.banner .nav li a:hover{
		color:white;
	}
	.banner .info{
		margin-top:15%;
		transform: translateY(-15%);
	}
	.banner .info h1{
		font-size:2.3em;
		font-weight:700;
		color:#fff;
		letter-spacing:2px;
		margin-top:10px;
	}
	.banner .info p{
		font-weight:500;
		color:#F5F5DC;
		letter-spacing:2px;
	}
	.banner .info a{
		margin-left:50%;
		transform: translateX(-50%);
		color:#fff;
		background:#B22222;
		font-size:25px;
		font-weight:600;
	}
		.banner .info a:hover{
		background:#e91e63;
		
	}
	</style>
<title>Home page</title>
</head>
<body>
<div class="container-fluid banner">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-md">
				<div class="navbar-brand">
					MALAYSIA CAMPING
				</div>
				<ul class="nav">
					<li class="nav-item">
						<a class="nav-link" href="#">HOME</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">ACCOUNT</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">BOOKING HISTORY</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">LOGOUT</a>
					</li>
				</ul>
			</nav>
		</div>
		<div class="col-md-8 offset-md-2 info">
			<h1 class="text-center mb-">BOOKING FORM</h1>
			<p class="text-center ">
				Campgrounds await your exploration and discovery throughout Malaysia. 
			</p>
			<a onclick="window.location.href='Bookingform.jsp';" class="btn btn-md text-center mt-5">GET STARTTED</a>
		
		</div>
	</div>
</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>