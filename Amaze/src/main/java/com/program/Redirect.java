package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/redirect")
public class Redirect extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession session=req.getSession();
		if(session.getAttribute("email")==null) {
			resp.sendRedirect("HomePage.jsp");
		}else {
			String email=(String)session.getAttribute("email");
			System.out.println(email+"redirect");
			String username=(String)session.getAttribute("username");
			session.setAttribute("email", email);
			session.setAttribute("username", username);
			out.println("Order Placed successfully");
			resp.sendRedirect("MainPage.jsp");}
	}
	
}	
