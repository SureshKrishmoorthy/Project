package com.program;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resource.Customer;
import com.resource.Data;

@WebServlet("/removecart")
public class RemoveItem extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		if(session.getAttribute("email")==null) {
			resp.sendRedirect("HomePage.jsp");
		}else {
			String email=(String) session.getAttribute("email");
			Integer val=Integer.parseInt(req.getParameter("value"));
			System.out.println(val+"***");
			Customer ref=Data.map.get(email);
			ref.getList().remove(val);
			resp.sendRedirect("Cart.jsp");
		}
	}
	
}
