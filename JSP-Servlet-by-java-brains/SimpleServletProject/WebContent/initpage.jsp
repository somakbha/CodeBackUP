<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
public void jspInit(){
	
	String uname = getServletConfig().getInitParameter("defaultUser");
	
	getServletContext().setAttribute("default user name", uname);
	
}


%>

The default user name obtained from web.xml using init parameter: <%=getServletConfig().getInitParameter("defaultUser") %>
</br>
The default user name obtained from servlet context: <%=getServletContext().getAttribute("default user name") %>
</body>
</html>