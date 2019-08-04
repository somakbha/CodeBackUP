package org.somak.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionContextServlet
 */
@WebServlet("/SessionContextServlet")
public class SessionContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionContextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		
		HttpSession session=request.getSession();
		ServletContext ctx=request.getServletContext();
		
		if (userName!="" && userName!=null)
		{
			session.setAttribute("USERNAME", userName);
			ctx.setAttribute("USERNAME", userName);
		}
		
		PrintWriter out=response.getWriter();
		out.println("user name obtained from request parameter: "+userName);
		out.println("user name obtained from session object: "+session.getAttribute("USERNAME"));
		out.println("user name obtained from context object: "+ctx.getAttribute("USERNAME"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
