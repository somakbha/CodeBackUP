<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<body>
<% 
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String address=request.getParameter("address");
String qualification=request.getParameter("qual");

out.println("<pre>");
out.println("values going to be submitted in DB:");
out.println("name: "+name);
out.println("email: "+email);
out.println("address: "+address);
out.println("qual: "+qualification);
out.println("</pre>");
%>

</body>
</html>