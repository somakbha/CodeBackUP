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
public int add (int a, int b)
{
	return (a+b);
}

%>
Current date is <h1><%= new java.util.Date() %></h1>

<h3>Testing JSP</h3>
<%

int p=10;
p=p+1;
out.println("value of p is "+p);

%>
</br>

The value of p is further incremented: <%=p+1 %>
</br>
result of sum is <%=add(123456,78901) %>
</br>
<% for (int i=0; i<10; i++) {%>

The new value of i=<%= i %>"
</br>
<%} %>
</body>
</html>