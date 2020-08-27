package com.leoaslan.servlet.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/annotation"}, initParams =  {
		@WebInitParam(name = "emailSupport1", value = "abc@example.com"),
		@WebInitParam(name = "emailSupport2", value = "xyz@example.com")
})
public class AnnotationExample extends HttpServlet{
	private String emailSupport1;
	
	public AnnotationExample() {}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		this.emailSupport1 = config.getInitParameter("emailSupport1");
	}
	
	@Override
	protected void doGet(HttpServletRequest resquest, HttpServletResponse response) throws IOException {
		String emailSupport2 = this.getServletConfig().getInitParameter("emailSupport2");
		
		ServletOutputStream out = response.getOutputStream();
		
		out.print("<html>");
		out.print("<head><title>Init Param</title></head>");
		
		out.println("<body>");
		out.println("<h3>Init Param</h3>");
		out.println("<p>emailSupport1=" + this.emailSupport1 + "</p>");
		out.println("<p>emailSupport2=" + emailSupport2 + "</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
