package com.isooou.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/testAttr")
public class TestAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TestAttr() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Object requestAttr = request.getAttribute("requestAttr");
		out.println("requestAttr::::"+requestAttr);
		
		Object sessionAttr = request.getSession().getAttribute("sessionAttr");
		out.println("sessionAttr::::"+sessionAttr);
		
		Object applicationAttr = getServletContext().getAttribute("applicationAttr");
		out.println("applicationAttr::::"+applicationAttr);
	}

}
