<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
//Just create some sample data.. normally provided by MVC

String [] cities={"Mumbai", "Singapore", "Bangalore"};

pageContext.setAttribute("myCities", cities);

%>

Hello there cities:

<c:forEach var="tempCity" items="${myCities }">

<br/>
${tempCity} 

</c:forEach>
<!-- <html>

<body>

</body>
</html> -->