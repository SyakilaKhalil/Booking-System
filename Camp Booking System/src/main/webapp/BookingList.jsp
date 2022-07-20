<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@page import="CampDA.DB"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Booking Report Page</title>
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
		.center {
  		margin-left: auto;
  		margin-right: auto;
  		width: 100%;
  		border-collapse: collapse;
  		border-spacing: 0;
  		border: 1px solid #ddd;
		}
		
		th, td {
  		text-align: left;
  		padding: 8px;
		}
		h1 { color: #7c795d; font-family:
		 'Trocchi', serif; font-size: 45px; 
		 font-weight: normal; line-height: 48px;  
		 text-align:center;
		 margin_top:20px;
		 }
	</style>
</head>
<body>

 <%!
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
        %>
	<h1>BOOKING DETAILS</h1>
	<section class="Form my-4 mc-5">
	<div class="container">
		<div class="row">
			<img src="banner.png" alt="Banner" style="width:100%;">
		<table class= "center">
		<tr>
			<th>Booking ID</th>
			<th>No of Pax</th>
			<th>Campsite Type</th>
			<th>Tent Type</th>
			<th>Tent Quantity</th>
			<th>Check-in Date</th>
			<th>Check-out Date</th>
			
		</tr>	
		<%
            con = DB.getConnection();
            String sql = "select * from tentrent";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            %>
            <tr>
            	<td><%=rs.getString(1)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(7)%></td>
                <td><%=rs.getString(8)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
            </tr>
            <%
                }
            %>
		</table>
		</div>
	</div>
	
	</section>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>

