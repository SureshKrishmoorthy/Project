package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resource.Customer;
import com.resource.Data;

@WebServlet("/newuser")
public class NewUser extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setHeader("Pragma", "no-cache");
		resp.setContentType("Text/html");
		resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		Long number = Long.parseLong(req.getParameter("number"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		int age = Integer.parseInt(req.getParameter("age"));
		if (Data.map.containsKey(email)) {
			out.println("Email Already present");
			resp.sendRedirect("Cart.jsp");

		} else {
			Data.map.put(email, new Customer(name, number, password, age));
			resp.sendRedirect("Login.html");
		}
	}
	
}
