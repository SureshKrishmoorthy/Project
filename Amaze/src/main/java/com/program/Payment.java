package com.program;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resource.Address;
import com.resource.Customer;
import com.resource.Data;

@WebServlet("/payment")
public class Payment extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String address=req.getParameter("firstline")+req.getParameter("secondline");
		String payment =req.getParameter("payment");
		HttpSession session =req.getSession();
		if(session.getAttribute("email")==null) {
			resp.sendRedirect("HomePage.jsp");
		}else {
		String email=(String)session.getAttribute("email");
		String username=(String)session.getAttribute("username");
		System.out.println(email+"payment");
		session.setAttribute("email", email);
		session.setAttribute("username", username);
		System.out.println(email+"**");
		Customer ref=Data.map.get(email);
		ref.setAddress(new Address(name,address,payment));
		ref.setList();
		resp.sendRedirect("redirect");}
	}
	
}
