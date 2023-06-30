package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resource.Customer;
import com.resource.Data;

@WebServlet("/verify")
public class LoginVerify extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		Customer ref = (Customer) Data.map.get(email);
		if (Data.map.containsKey(email) && ref.getPassword().equals(password)) {
//			req.setAttribute("email", email);
			System.out.println(email);
			session.setAttribute("email", email);
//			req.setAttribute("username", ref.getName());
			session.setAttribute("username", ref.getName());
			System.out.println(ref.getName());
//			RequestDispatcher rd = req.getRequestDispatcher("MainPage.jsp");
//			rd.forward(req, resp);
			resp.sendRedirect("MainPage.jsp");
		} else {
			out.println("Invalid Username or pasword");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
		}
	}
	
}
