<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.resource.Storage" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.resource.Product" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Amazon</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        #head {
            background-color: #232f3e;
            padding: 10px;
            text-align: center;
            color: #fff;
        }

        h3 {
            margin: 0;
            font-size: 24px;
        }

        section {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            box-sizing: border-box;
        }

        #img {
            text-align: center;
        }

        #img img {
            max-width: 100%;
            height: 300px;
        }

        #heading {
            font-size: 24px;
            font-weight: bold;
            margin: 10px 0;
        }

        #caption {
            margin: 10px 0;
        }

        #price {
            font-size: 18px;
            color: #B12704;
        }

        a button {
            padding: 10px 20px;
            background-color: orange;
            color: black;
            text-decoration: none;
            border: none;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }

        a button:hover {
            background-color: orange;
        }
    </style>
</head>
<body>
<%if(session.getAttribute("email")==null){
    response.sendRedirect("HomePage.jsp");
}else{
    %>
    <header id="head">
        <h3>Amazon</h3>
        <% 
        session=request.getSession();
        String username = (String) session.getAttribute("username");
        if (username != null) {
            %>
            <div id="user-info">
                Welcome, <%= username %>!
                <a href="Cart.jsp" style="float: right; padding-right: 10px;">Cart</a>
                <a href='Order.jsp' style="float: right; padding-right: 10px;">Orders</a>
            </div>
        <% } else { %>
            <div>
                <a href="Login.html">Login</a> | <a href="Register.html">Sign Up</a>
            </div>
        <% } %>
    </header>
    <% 
    Integer id = Integer.parseInt(request.getParameter("value"));
    HashMap<Integer, Product> map = Storage.map1;
    Product ref = map.get(id);
    String caption = ref.getCaption();
    String desc = ref.getDescription();
    Double price = ref.getPrice();
    %>
    <section>
        <div id="img"><img src="<%= ref.getImg_path() %>" alt="img"></div>
        <div id="heading"><h4><%= caption %></h4></div>
        <div id="caption"><p><%= desc %></p></div>
        <h3 id="price">$ <%= price %></h3>
        <a href="addcart?value=<%= id %>"><button>Add to Cart</button></a>
    </section>
<% } %>
</body>
</html>
