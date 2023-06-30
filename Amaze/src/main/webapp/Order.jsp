<%@page import="com.resource.Data" import="com.resource.Storage" import="com.resource.Product" import="com.resource.Customer" import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        
        #head {
            background-color: grey;
            padding: 10px;
            text-align: center;
            color: orange;
        }
        
        .cart-item {
            display: flex;
            align-items: center;
            padding: 10px;
            width: 55%;
            border: 1px solid;
            margin-top: 20px;
        }
        
        .cart-item img {
            width: 100px;
            margin-right: 20px;
        }
        
        .cart-item-content {
            flex-grow: 1;
        }
        
        .cart-item h4 {
            margin-bottom: 10px;
        }
        
        .cart-item button {
            background-color: orange;
            color: white;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
        }
        
        .cart-item button:hover {
            background-color: orange;
        }
    </style>
</head>
<body>
<% if(session.getAttribute("email") == null) {
    response.sendRedirect("HomePage.jsp");
} else {
%>
    <header id="head">
        <h3>Amazon</h3>
        <% 
        String username = (String) session.getAttribute("username");
        String email = (String) session.getAttribute("email");
        if (username != null) {
        %>
            <div id="user-info">
                Hi, <%= username %>!
                <a href="Cart.jsp" style="float: right; padding-right: 10px;">Cart</a>
                <a href="logout" style="float: right; padding-right: 10px;">Log Out</a>
            </div>
        <% } %>
    </header>
    <% 
    Customer ref = Data.map.get(email);
    ArrayList<Integer> list1 = ref.getOrder();
    ArrayList address = ref.getAddress();
    double price = 0;
    int count = list1.size();
    for (Integer l : list1) {
        int i = 0;
        Product pro = (Product) Storage.map1.get(l);
        price += pro.getPrice();
        if (pro != null) {
    %>
        <div class="cart-item">
            <img src="<%= pro.getImg_path() %>" alt="">
            <div class="cart-item-content">
                <div id="caption">
                    <h3><%= pro.getCaption() %></h3>
                </div>
                <h5><%= address.get(i) %></h5>
            </div>
        </div>
    <% } else { %>
        <h2>Order is empty</h2>
    <% }
        i++;
    }
%>
<% } %>
</body>
</html>
