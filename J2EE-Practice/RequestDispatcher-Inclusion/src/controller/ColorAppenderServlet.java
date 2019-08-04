package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegFormServlet
 */

public class ColorAppenderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ColorAppenderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Obtain RequestDispatcher by using URL pattern
		RequestDispatcher rd = request.getRequestDispatcher("/next");
		
		// Obtain RequestDispatcher by using Class Name, it is giving me NullPointerException
		
		//RequestDispatcher rd=getServletContext().getNamedDispatcher("HelloWorldServlet");
		
		
		PrintWriter out = response.getWriter();
		//CSS(Cascade style sheet) way of writing
		out.println("<body style='background-color:green;'>");
		rd.include(request, response);
		out.println("<body>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
