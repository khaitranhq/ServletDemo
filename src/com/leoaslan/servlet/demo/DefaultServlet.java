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
	}
}
