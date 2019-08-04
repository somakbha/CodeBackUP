package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidateFilter
 */

public class ValidateFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ValidateFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println ("Filter destroy called");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int marks=Integer.parseInt(request.getParameter("marks"));
		
		PrintWriter out=response.getWriter();
		if (name.equals("")||email.equals("")||marks<=0)
		{
			out.println("Validation error");
		}

		// pass the request along the filter chain
		
		
		out.println("<div style='border-style:dashed;border-color:red;color:green;font-size:30;'>");
		out.println("<pre>");
		chain.doFilter(request, response);
		out.println("</pre>");
		out.println("</div>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println ("Filter init called");
	}

}
