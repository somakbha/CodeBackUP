<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User registration Page</title>
</head>
<body>

<form action="./process.jsp" method="post">
<pre>
<br> User ID: <input type="text" name="userId"> 
<br> User Name: <input type="text" name="userName"> 
<br> Address Line 1: <input type="text" name="address1"> 
<br> Address Line 2: <input type="text" name="address2"> 
<br> City: <input type="text" name="city"> 
<br> State: <input type="text" name="state"> 
<br> Pin Code: <input type="text" name="pincode"> 

<input type="submit"/>
</pre>
</form>
</body>
</html>