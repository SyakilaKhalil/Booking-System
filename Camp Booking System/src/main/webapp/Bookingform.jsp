<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: #D8D8D8;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
  border-radius:30px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

<form action="/action_page.php">
  <div class="container">
    <h1>Booking</h1>
    <p>Please fill in this form to book for a camp slot.</p>
    <hr>

	<label>Number Of Pax:</label><br> 
      <input class="" type = "radio" name = "pax" value = "2" checked />1 - 20 pax
      <Br>
      <input type = "radio" name = "pax" value = "4">21 - 50 pax
  
    
	<br><br>
	<select >
    <option value="0">Select package:</option>
    <option  value="158">Double Tent</option>
    <option  value="238">Quad Tent</option>
    <option  value="408">Deluxe 8 Tent</option></select>
	<br><br>
	 <label>Check-in:
    <input type="date" name="bday" required pattern="\d{4}-\d{2}-\d{2}">
    <span class="validity"></span>
  </label>
  <br><br>
  	 <label>Check-out:
    <input type="date" name="bday" required pattern="\d{4}-\d{2}-\d{2}">
    <span class="validity"></span>
  </label>
  <br><br>
    <label for="remark"><b>Remarks</b></label>
    <input type="text" placeholder="Additional remarks" name="remark" id="remark">

   
    <hr>
 

    <button style="background-color:#b87023;" type="submit" class="registerbtn">Register</button>
  </div>
  

</form>

</body>
</html>