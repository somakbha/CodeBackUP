<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Include</title>
</head>
<body>

<!-- Page include approach of including html-->
<pre>
<jsp:include page="header.html"/>
</pre>
<pre>
<!-- Directive include approach of including html-->
</pre>
<%@ include file="header.html"%>

<pre>
This is the mail page
Here we will include heder and footer html page
</pre>
</body>
</html>