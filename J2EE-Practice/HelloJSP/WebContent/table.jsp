<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Table JSP</title>
</head>
<body bgcolor="cyan">

<!-- Create a table dynamically -->

<table border="5">
<tr><th>NUMBER:</th><th>Values</th><tr>

<%for (int i=0;i<10;i++) {%>

<tr><td><%out.println("NUMBER"+(i+1)); %></td><td><%out.println(i+1); %></td><tr>
<%} %>
</table>


</body>
</html>