package com.servletpkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet("/Myservletcontext")*/
public class Myservletcontext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
		  
		ServletContext context=getServletContext();  
		Enumeration<String> e=context.getInitParameterNames();  
		      
		String str="";  
		while(e.hasMoreElements()){  
		    str=e.nextElement();  
		    out.print("<br> "+context.getInitParameter(str));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
