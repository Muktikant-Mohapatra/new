<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
		<pre>
             Name :<input type="text" name="name" />
             DOB :<input type="date" name="dob" />
             <input type="radio" name="gender" value="male"> Male
             <input type="radio" name="gender" value="female"> Female
             Phone : <input type="text" name="phone" /> 
             Email : <input type="email" name="email" />
             Password :<input type="password" name="password" />
         <button type="submit">Register</button>
      </pre>
	</form>
	<form action="login" method="post">
		<pre>
	    Email :<input type="text" name="email" />
	    Password:<input type="password" name="password" />
	    <button type="submit">Sign in</button>
	  </pre>
	</form>
</body>
</html>