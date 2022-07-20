<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% if(session.getAttribute("staff_email")==null)
	response.sendRedirect("LoginStaff.jsp");
%>
<%@page import="CampDA.DB"%>
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
		
	</style>
</head>
<body>
	<%!
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
        %>
	<section class="Form my-4 mc-5">
	<div class="container">
		<div class="row">
			<img src="banner.png" alt="Banner" style="width:100%;">
		<table class= "center">
		<tr>
			<th>Name</th>
			<th>Contact No</th>
			<th>No of Pax</th>
			<th>Campsite Type</th>
			<th>Check-in Date</th>
			<th>Check-out Date</th>
			<th>Remarks</th>
		</tr>
		
		<%
            con = DB.getConnection();
            String sql = "select participant_name, participant_phonenum, no_pax, checkin_date, checkout_date, remarks from campsite join participant using (participant_phonenum)";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            %>	
			<tr>
            	<td><%=rs.getString(1)%></td>
            	<td><%=rs.getString(2)%></td>
            	<td><%=rs.getString(3)%></td>
                <td><a href="deleteParticipant?phonenum=<%=rs.getString(2)%>">Delete</a></td>
            </tr>
            <%
                } con.close();
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