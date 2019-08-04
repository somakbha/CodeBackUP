<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String uname=request.getParameter("uname") ;

String password=request.getParameter("pwd") ;



if (uname.equals("admin") && password.equals("admin"))
{
	response.sendRedirect("./success.jsp");
	
		//We are setting the values through request as well as session object. This will demonstrate that requrest object scope dies in case of redirect while session scope is still alive
		request.setAttribute("msg", "login success");
		session.setAttribute("msg", "login success");
	} else {
		response.sendRedirect("./fail.jsp");
		request.setAttribute("msg", "login failed");
		session.setAttribute("msg", "login failed");
	}
%>

</body>
</html>