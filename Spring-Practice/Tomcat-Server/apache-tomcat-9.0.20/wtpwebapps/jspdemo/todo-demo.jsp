<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Additional Step: Create Logout  -->
<a href="logout.jsp">LogOut</a>
<br>

<!-- Step 1: Create HTML form -->
<form action="todo-demo.jsp">
Add new item:<input type="text" name="theItem"/>
<input type="submit" value="submit">
</form>
<br>

<!-- Step 2: Add new item to "To Do" list -->

<%
	//get the TO DO items from the session
//if the TO Do items doesn't exist, then create a new one
// see if there is form data to add
List <String> items=(List<String>)session.getAttribute("myToDoList");
if (items==null){
	items=new ArrayList<String>();
	session.setAttribute("myToDoList", items);
}

String theItem=request.getParameter("theItem");
if (theItem!=null && (!theItem.trim().equals(""))){
	
		/* Since we're using object references, remember that "items" is a variable that holds a reference to an object. 
		Then it points to the same area of memory that is used by the session. So in effect, 
		the users's session has now been updated with this new entry. */
		items.add(theItem);

		/* Question: If I refresh/reload the browser, it is automatically adding previously added item. Any solution for this problem?
		Answer: Yes, you can perform a "redirect" in your code to solve this problem. In your code make the following update. 
		Make note of the new code for: response.sendRedirect("todo-demo.jsp"); */
		
		response.sendRedirect("todo-demo.jsp");

	}
%>

<!-- Step1: Display all "TO Do" item from session -->
To Do Lists:
<ol>
<%
for (String itm: (List<String>)session.getAttribute("myToDoList"))
{
	out.println("<li>"+itm+"</li>");
}

%>
</ol>
</body>
</html>