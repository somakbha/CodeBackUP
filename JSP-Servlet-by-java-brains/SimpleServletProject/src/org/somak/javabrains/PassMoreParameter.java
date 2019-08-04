package org.somak.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PassMoreParameter
 */
@WebServlet("/PassMoreParameter")
public class PassMoreParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassMoreParameter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("uname");
		String uid=request.getParameter("uid");
		String prof=request.getParameter("prof");
		String loc=request.getParameter("location");
		
		String workLocation[]=request.getParameterValues("work-location");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h3>By POST request: User name is: "+UserName+" user id is: "+uid+" and his profession is: "+prof+"</h3>");
		out.println("<h3>Location is: "+loc+"</h3>");
		
		out.println("your worklocations are");
		for (String wl:workLocation)
		{
			out.println(wl);
			out.println("</br>");
		}
	}

}
