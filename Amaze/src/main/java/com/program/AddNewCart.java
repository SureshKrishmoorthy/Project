package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resource.Customer;

@WebServlet("/addcart")
public class AddNewCart extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		if(session.getAttribute("email")==null) {
			resp.sendRedirect("HomePage.jsp");
		}else {
		resp.setContentType("text/html");
		String email = (String) session.getAttribute("email");
		String username = (String) session.getAttribute("username");
		System.out.println(email+"**********");
		session.setAttribute("email", email);
		session.setAttribute("username", username);
		System.out.println(email);
		Customer ref = com.resource.Data.map.get(email);
		System.out.println(ref);
		if (email != null) {
			Integer id = Integer.parseInt(req.getParameter("value"));
			System.out.println(id);
			if (!ref.getList().contains(id)) {
				ref.setList(id);
				resp.sendRedirect("Cart.jsp");
//		        System.out.println("hello");
			} else {
				resp.sendRedirect("Cart.jsp");
				System.out.println("Cart already added");
			}
		} else {
			out.println("You are not logged in. Please log in");
			out.println("<br><a href='Login.html'>Login</a> <br><a href='Register.html'>Sign Up</a>");
		}
	}
}
	
}
