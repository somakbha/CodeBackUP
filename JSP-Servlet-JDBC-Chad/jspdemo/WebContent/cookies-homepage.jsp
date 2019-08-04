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

String favLanguage="java";

Cookie theCookieList[]=request.getCookies();

for (Cookie cookie:theCookieList)
{
	if ("myFavoriteLanguage".equals(cookie.getName()))
	{
		System.out.println(cookie.getValue());
		favLanguage=cookie.getValue();
		break;
	}
}

%>

News for Language <%= favLanguage %>

<a href="cookies-personalize-form.html">Personalize this page</a>

</body>
</html>