package com.leoaslan.servlet.demo;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class DefaultServlet extends HttpServlet{
	public DefaultServlet() {}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ServletOutputStream outputStream = response.getOutputStream();
		
		outputStream.print("<html>");
		outputStream.print("<head><title>Page not found</title></head>");
		
		outputStream.print("<body>");
		outputStream.print("<h3>Sorry!Page not found</h3>");
		outputStream.print("<h1>404</h1>");
		outputStream.print("Message from servlet: " + this.getClass().getName());
		outputStream.print("</body>");
		outputStream.print("<html>");
	}
}
