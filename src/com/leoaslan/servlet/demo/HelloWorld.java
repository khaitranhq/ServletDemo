package com.leoaslan.servlet.demo;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet{
	private static final long serialversionUID = 1;
	
	public HelloWorld() {
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ServletOutputStream outputStream = response.getOutputStream();
		
		outputStream.print("<html>");
		outputStream.print("<head><title>Hello World</title></head>");
		
		outputStream.print("<body>");
		outputStream.print("<h3>Hello World</h3>");
		outputStream.print("</body>");
		
		outputStream.print("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this.doGet(request, response);
	}
}
