package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		out.print("hi");
		/*ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
        out.print(str);*/
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.print(str);
	}
}
