<%@page import="com.resource.Product"%>
<%@page import="com.resource.Storage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap" import="java.util.Map"%>

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
        
        a {
            color: #000;
            text-decoration: none;
        }
        
        h3 {
            margin: 0;
            font-size: 24px;
        }
        
        section {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
        }
        
        .spans {
            display: flex;
            flex-direction: column;
            align-items: center;
            margin: 10px;
            width: 200px;
            border: 1px solid #ddd;
            padding: 10px;
            border-radius: 5px;
            text-align: center;
        }
        
        #img img {
            width: 100%;
            max-height: 200px;
            object-fit: contain;
        }
        
        #caption {
            margin: 10px 0;
            font-weight: bold;
        }
        
        #button button {
            background-color: #f0c14b;
            color: #111;
            padding: 5px 10px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 14px;
        }
        
        #button button:hover {
            background-color: #e4b24f;
        }
        
        footer {
            background-color: #00549e;
            padding: 10px;
            text-align: center;
            color: #fff;
        }
    </style>
</head>
<body>
    <header id="head">
        <h1>Amazon</h1>
        <div>
            <a href="Login.html">Login</a> | <a href="Register.html">Sign Up</a>
        </div>
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
            <a href="caption.jsp?value=<%= id %>"><h4 id="caption"><%= ref.getCaption() %></h4></a>
            <a href="addcart?value=<%= id %>"><button value="<%= id %>">Add to Cart</button></a>
        </span>
        <% } %>
    </section>
</body>
</html>
