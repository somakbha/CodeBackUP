<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- This page will get all the request parameters from the login page and put them inside a data transfer object (dto) -->

<jsp:useBean id="user" class="org.somak.javabrains.dto.User" scope="request">

<!-- param is attribute name mentioned in login.jsp -->
 <jsp:setProperty property="userId" name="user" param="userId"/>
 <jsp:setProperty property="userName" name="user" param="userName"/>
 <jsp:setProperty property="address1" name="user" param="address1"/>
 <jsp:setProperty property="address2" name="user" param="address2"/>
 <jsp:setProperty property="city" name="user" param="city"/>
 <jsp:setProperty property="state" name="user" param="state"/>
 <jsp:setProperty property="pincode" name="user" param="pincode"/>
</jsp:useBean>

Hello 
</br><jsp:getProperty property="userId" name="user" />
</br><jsp:getProperty property="userName" name="user" />
</br><jsp:getProperty property="address1" name="user" />
</br><jsp:getProperty property="address2" name="user" />
</br><jsp:getProperty property="city" name="user" />
</br><jsp:getProperty property="state" name="user" />
</br><jsp:getProperty property="pincode" name="user" />
</body>
</html>