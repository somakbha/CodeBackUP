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

String username=request.getParameter("uname");

if (username!=null){
	
	session.setAttribute("session-username", username);
	application.setAttribute("context-username", username);
	pageContext.setAttribute("pagecontext-username", username);
	
	//The behavior of this variable should be same as request score variable
	pageContext.setAttribute("request-scope-username-using-pagecontext", username,PageContext.REQUEST_SCOPE);
	
	//The behavior of this variable should be same as session score variable
	pageContext.setAttribute("session-scope-username-using-pagecontext", username,PageContext.SESSION_SCOPE);
	
	//The behavior of this variable should be same as application score variable
	
	pageContext.setAttribute("application-scope-username-using-pagecontext", username,PageContext.APPLICATION_SCOPE);
}

%>

</br>

User names in request object are  <%= username%> and <%= request.getAttribute("request-scope-username-using-pagecontext") %>

</br>

User names in session object are  <%= session.getAttribute("session-username")%> and <%= session.getAttribute("session-scope-username-using-pagecontext")%>

</br>

User names in application context object are  <%= application.getAttribute("context-username")%> and <%= application.getAttribute("application-scope-username-using-pagecontext")%>

</br>

User names in page context object are  <%= pageContext.getAttribute("pagecontext-username")%> 

</br>
Value of a variable searched using findAttribute when the variable is present in one of the scope (pageContext/request/session/application) <%=pageContext.findAttribute("session-username") %>

</br>
Value of a variable searched using findAttribute when the variable is not present in any of the scope (pageContext/request/session/application) <%=pageContext.findAttribute("invalid-user-name") %>


</body>
</html>