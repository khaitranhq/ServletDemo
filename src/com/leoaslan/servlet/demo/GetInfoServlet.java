package com.leoaslan.servlet.demo;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/info")
public class GetInfoServlet extends HttpServlet{
	public GetInfoServlet() {}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ServletOutputStream out = response.getOutputStream();
		
		out.print("<style>span {color: blue;} </style>");
		
		String requestURL = request.getRequestURL().toString();
		out.print("<br><span>requestURL: </span>");
		out.print(requestURL);
		
		String contextPathString = request.getContextPath().toString();
		out.print("<br><span>Context Path: "+ contextPathString + "</span>");
		
		String servletPath = request.getServletPath().toString();
		out.print("<br><span>Servlet Path: " + servletPath + "</span>");
		
		String queryString = request.getQueryString();
		out.print("<br><span>Query String: " + queryString + "</span>");
		
		String param1 = request.getParameter("param1");
		out.print("<br><span>Param 1: " + param1 + "</span>");
		
		String param2 = request.getParameter("taram2");
		out.print("<br><span>Param 2: " + param2 + "</span>");
		
		//Server info
		out.print("<br><br><b>Server Info: <b>");
		
		String serverName = request.getServerName();
		out.print("<br><span>Server Name: " + serverName + "</span>");
		
		int serverPort = request.getServerPort();
		out.print("<br><span>Server port: " + serverPort + "</span>");
	}
}
