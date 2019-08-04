package org.somak.javabrains;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.somak.javabrains.dto.User;
import org.somak.javabrains.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		LoginService loginservice = new LoginService();
		boolean result=loginservice.authenticate(userId, password);
		
		if (result)
		{
			User user=loginservice.getUserDetails(userId);
			
			// this will ask browser to redirect to success.jsp. However with new
			// requirement we want to put user data to view also. Hence requestDispatcher or session scope
			// need to be used or we can use session object
			
			//approach 1 using sesison 
			/*request.getSession().setAttribute("user", user);
			response.sendRedirect("success.jsp");*/
			
			//approach 2 using request dispatcher
			
			request.setAttribute("user", user);
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			return;
		}
		else
		{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}