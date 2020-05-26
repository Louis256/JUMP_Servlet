package com.jump;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class accordion
 */
@WebServlet("/accordion")
public class accordion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accordion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html><head>\n" + 
				"  <meta charset=\"utf-8\">\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + 
				"  <title>jQuery UI Accordion - Default functionality</title>\n" + 
				"  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n" + 
				"  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n" + 
				"  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n" + 
				"  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n" + 
				"  <script>\n" + 
				"  $( function() {\n" + 
				"    $( \"#accordion\" ).accordion();\n" + 
				"  } );\n" + 
				"  </script>\n" + 
				"</head><Title>Accordion</Title><body>");
		out.println("<h1>Learn Java In 21 Days</h1><h2>Chapter1</h2>");
		out.println("<div id=accordion> <h3>"+ "About This Book"+"</h3><div><p>"+ "This book teaches you all about the Java language and how to use it to createapplets and applications. By the time you get through with this book, you’ll knowenough about Java to do just about anything, inside an applet or out."+"</p></div>");
		out.println("<h3>"+ "Who Should Read This Book"+"</h3><div><p>"+ "This book is intended for people with at least some basic programming back-ground, which includes people with years of programming experience or peoplewith only a small amount of experience. If you understand what variables, loops,and functions are, you’ll be just fine for this book. The sorts of people who mightwant to read this book include you."+"</p></div>");
		out.println("<h3>"+ "How This Book Is Structured"+"</h3><div><p>"+ "This book is intended to be read and absorbed over the course of three weeks.During each week, you’ll read seven chapters that present concepts related to theJava language and the creation of applets and applications."+"</p></div>");
		out.println("<h3>"+ "Conventions"+"</h3><div><ul><li>"+ "Note: A Note box presents interesting pieces of information related to the surround-ing discussion."+"</li><li>"+"Technical Note: A Technical Note presents specific technical information related tothe surrounding discussion."+"<li>"+"Tip: A Tip box offers advice or teaches an easier way to do something."
				+ "</li></li></ul></div>");
		out.println("<h3>"+ "About the Authors"+"</h3><div><p>"+ "Laura  Lemay  is  a  technical  writer  and  a  nerd.  After  spending  six  years  writing  softwaredocumentation for various computer companies in Silicon Valley, she decided writing bookswould be much more fun (but has still not yet made up her mind). In her spare time she collectscomputers, e-mail addresses, interesting hair colors, and nonrunning motorcycles. She is also theperpetrator of Teach Yourself Web Publishing with HTML in 14 Days."+"</p></div>");
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
