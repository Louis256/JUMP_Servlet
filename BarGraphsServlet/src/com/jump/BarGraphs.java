package com.jump;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.*;
import java.awt.*; 



/**
 * Servlet implementation class BarGraphs
 */
@WebServlet("/BarGraphs")
public class BarGraphs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BarGraphs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		out.println("<html><Title>Bar Graph</Title><head><link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\"></head><script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n" + 
				"<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script><body>");
		out.println("<div style=\"background-color:powderblue\">");
		out.println("<h1>Baseball Team Records Season 2019 </h1>");
		out.println("<br><div class=\"progress\"style=\"height: 30px;\">\n" + 
				"  <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 26%;\" aria-valuenow=\"25\" aria-valuemin=\"0\" aria-valuemax=\"100\">Yankees</div>\n" + 
				"</div><br>");		
		out.println("<br><div class=\"progress\"style=\"height: 30px;\">\n" + 
				"  <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 23%;\" aria-valuenow=\"25\" aria-valuemin=\"0\" aria-valuemax=\"100\">Rays</div>\n" + 
				"</div><br>");
		out.println("<br><div class=\"progress\"style=\"height: 30px;\">\n" + 
				"  <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 20%;\" aria-valuenow=\"25\" aria-valuemin=\"0\" aria-valuemax=\"100\">Red Sox</div>\n" + 
				"</div><br>");		
		out.println("<br><div class=\"progress\"style=\"height: 30px;\">\n" + 
				"  <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 17%;\" aria-valuenow=\"25\" aria-valuemin=\"0\" aria-valuemax=\"100\">Blue Jays</div>\n" + 
				"</div><br>");		
		out.println("<br><div class=\"progress\"style=\"height: 30px;\">\n" + 
				"  <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 13%;\" aria-valuenow=\"25\" aria-valuemin=\"0\" aria-valuemax=\"100\">Orioles</div>\n" + 
				"</div>");
		
		out.println("</div>");
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
