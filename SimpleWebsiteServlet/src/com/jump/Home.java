package com.jump;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html><Title>Simple Webstie</Title><head><link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\"></head><script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n" + 
				"<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script><body>");
		out.println("<h1>This is home page</h1>");
		//response.sendRedirect("/AboutUs");		
		/**
		out.println("<a href=\"AboutUs\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">About Us</a>");
		out.println("<a href=\"ContactUs\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Contact Us</a>");
		out.println("<a href=\"Locations\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Locations</a>");
		out.println("<a href=\"Projects\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Projects</a>");
		//out.println("<a href=./ContactUs>About Us</a>");
		**/
		out.println("<nav aria-label=\"breadcrumb\">\n" + 
				"  <ol class=\"breadcrumb\">\n" + 
				"    <li class=\"breadcrumb-item active\" aria-current=\"Home\">Home</li>\n" + 
				"    <li class=\"breadcrumb-item\"><a href=\"AboutUs\">About Us</a></li>\n" + 
				"    <li class=\"breadcrumb-item\"><a href=\"ContactUs\">Contact Us</a></li>\n" + 
				"    <li class=\"breadcrumb-item\"><a href=\"Locations\">Locations</a></li>\n" +
				"    <li class=\"breadcrumb-item\"><a href=\"Projects\">Projects</a></li>\n" +				
				"  </ol>\n" + 
				"</nav>");
		out.println("<span class=\"d-block p-2 bg-dark text-white\"><p>Welcome to My Web</p></span>");		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
