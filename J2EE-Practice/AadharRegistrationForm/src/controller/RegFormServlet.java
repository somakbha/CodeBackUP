package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegFormServlet
 */

public class RegFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fno=request.getParameter("fno");
		HttpSession hs=request.getSession();
		
		if (fno.equals("1"))
		{
			String name=request.getParameter("name");
			String fname=request.getParameter("fname");
			String mname=request.getParameter("mname");
			
			hs.setAttribute("name", name);
			hs.setAttribute("fname", fname);
			hs.setAttribute("mname", mname);
			
			response.sendRedirect("form2.html");
			
		}
		
		if (fno.equals("2"))
		{
			String contact=request.getParameter("contact");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			
			hs.setAttribute("contact", contact);
			hs.setAttribute("email", email);
			hs.setAttribute("address", address);
			
			response.sendRedirect("form3.html");
			
		}
		
		if (fno.equals("3"))
		{
			String qual=request.getParameter("qual");
			String per=request.getParameter("per");
			
			hs.setAttribute("qual", qual);
			hs.setAttribute("per", per);
			
			String msg = "Data submitted in DB " + hs.getAttribute("name") + "---" + hs.getAttribute("fname")
					+ hs.getAttribute("mname") + "---" + hs.getAttribute("contact") + hs.getAttribute("email") + "---"
					+ hs.getAttribute("address") +"---" + hs.getAttribute("qual") + "---" + hs.getAttribute("per");
			response.getWriter().append(msg);
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