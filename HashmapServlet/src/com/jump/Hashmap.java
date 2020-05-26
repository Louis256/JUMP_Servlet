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
 * Servlet implementation class Hashmap
 */
@WebServlet("/Hashmap")
public class Hashmap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hashmap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(24,"Sunday");
		hm.put(25,"Monday");
		hm.put(26,"Tuesday");
		hm.put(27,"Wednesday");
		hm.put(28,"Thursday");
		hm.put(29,"Friday");
		hm.put(30,"Saturday");
		
		out.println("<html><Title>Show Hashmap</Title><body>");
		out.println("<center><table border=1 style=\"background-color:CadetBlue\">");
		for(Map.Entry m:hm.entrySet()) {
			out.println("<tr><td>"+m.getKey()+"</td><td>"+m.getValue()+"</td></tr>");
		}
		
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
