<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Thanks! we set your favorite language to:${param.favoritelanguage}

<%
Cookie cookie=new Cookie("myFavoriteLanguage", request.getParameter("favoritelanguage"));
cookie.setMaxAge(60*60*24*365); //for one year
response.addCookie(cookie);

%>

<a href="cookies-homepage.jsp">Return to Home Page</a>
</body>
</html>