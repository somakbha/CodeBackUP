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

public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		PrintWriter out=response.getWriter();
		
		if (name.equals("")||email.equals("")||address.equals(""))
		{
			out.println("one or more parameter is empty");
		}
		
		else
		{
			//Validation is Successful so we should call the next Servlet RegistrationServlet here
			
			//Using method 1: not working as it is deprecated
			
			//RegistrationServlet rs=(RegistrationServlet) getServletContext().getServlet("RegistrationServlet");
			//rs.doPost(request, response);
			
			
			//Using method 2: RequestDispatcher
			RequestDispatcher rd=request.getRequestDispatcher("/next");
			rd.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
