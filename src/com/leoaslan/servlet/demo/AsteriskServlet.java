package com.leoaslan.servlet.demo;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/any/*")
public class AsteriskServlet extends HttpServlet{
	public AsteriskServlet() {}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ServletOutputStream out = response.getOutputStream();
		
		out.print("<html>");
		out.print("<head><title>Asterisk</title></head>");
		
		out.print("<body>");
		out.print("<h3>Your URL match /any/*</h3>");
		out.print("</body>");
		out.print("</html>");
	}
}
