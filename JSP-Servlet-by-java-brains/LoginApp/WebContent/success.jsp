<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.somak.javabrains.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
<h3>Login Successful!</h3>

<!-- using session attribute -->


<%-- <%
User user=(User) session.getAttribute("user");
%>

Hello <%=user.getUserName() %> --%>


<!-- using request attribute and request dispatcher from controller -->

<%-- <%
User user=(User) request.getAttribute("user");
%>
Hello <%=user.getUserName() %> --%>

<!-- using request attribute and request dispatcher from controller and JSTL -->

<jsp:useBean id="user" class="org.somak.javabrains.dto.User" scope="request">

<!-- The lines within jsp:useBean will get executed only when no user object is found in the above line for specified scope -->
  <jsp:setProperty property="userName" name="user" value="New User"/>

</jsp:useBean>

Hello <jsp:getProperty property="userName" name="user"/>
</body>
</html>