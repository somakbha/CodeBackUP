package org.somak.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PassParameter
 */
@WebServlet("/PassParameter")
public class PassParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassParameter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("uname");
		String uid=request.getParameter("uid");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h3>By Get request: User name is: "+UserName+" user id is: "+uid+"</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("uname");
		String uid=request.getParameter("uid");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h3>By POST request: User name is: "+UserName+" user id is: "+uid+"</h3>");
	}

}
