<%@page import="com.resource.Product"%>
<%@page import="com.resource.Storage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap" import="java.util.Map"%>

<%
if(session.getAttribute("email") == null) {
    System.out.println(session.getAttribute("email") + "hiii");
    response.sendRedirect("HomePage.jsp");
} else {
%>
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
            height: 50px;
        }

        h2 {
            margin: 0;
        }

        #user-info {
            float: right;
            padding-right: 10px;
        }

        #user-info a {
            color: #fff;
            margin-left: 10px;
            text-decoration: none;
        }

        #user-info a:hover {
            text-decoration: underline;
        }

        section {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
        }

        .spans {
            flex-basis: 200px;
            margin: 10px;
            padding: 10px;
            background-color: #f2f2f2;
            border: 1px solid #ccc;
            text-align: center;
        }

        #img img {
            max-width: 100%;
            height: 200px;
        }

        #caption {
            margin: 10px 0;
            font-weight: bold;
        }

        button {
            padding: 10px 20px;
            background-color: orange;
            color: black;
            text-decoration: none;
            border: none;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }

        button:hover {
            background-color: #ff9900;
        }
    </style>
</head>
<body>
    <header id="head">
        <h2>AMAZON</h2>
        <% 
        String email = (String)session.getAttribute("email");
        String username = (String)session.getAttribute("username");
        if (email != null) { 
        %>
        <div id="user-info">
            Welcome, <%= username %>!
            <a href='Cart.jsp'>Cart</a>
            <a href='/Amaze/src/main/webapp/Order.jsp'>My Orders</a>
            <a href='logout'>Log Out</a>
        </div>
        <% } else { %>
        <div>
            <a href="Login.html">Login</a> | <a href="Register.html">Sign Up</a>
        </div>
        <% } %>
    </header>
    <br><br>
    <section>
        <% 
        HashMap<Integer, Product> map = (HashMap<Integer, Product>)Storage.map1;
        for (Map.Entry<Integer, Product> entry : map.entrySet()) {
            Integer id = entry.getKey();
            Product ref = entry.getValue();
        %>
        <span class="spans">
            <div id="img"><img src="<%= ref.getImg_path() %>" alt=""></div>
            <a href="caption.jsp?value=<%= id %>"><div id="caption"><%= ref.getCaption() %></div></a>
            <a href="addcart?value=<%= id %>"><button value="<%= id %>">Add to Cart</button></a>
        </span>
        <% } %>
    </section>
</body>
</html>
<% } %>
