<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dynamic Registration Page</title>
</head>
<body>
<form action="./reg.jsp">
<pre>
ID: <input type="text" name="id">
NAME: <input type="text" name="name">
EMAIL: <input type="text" name="email">
ADDRESS: <input type="text" name="address">
QUALIFICATION: <select name="qual">
<option value="btech">btech</option>
<option value="mtech">mtech</option>
<option value="phd">phd</option>
</select>
<input type="submit" name="Register">
</pre>
</form>

</body>
</html>