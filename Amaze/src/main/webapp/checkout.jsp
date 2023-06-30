<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon - Checkout</title>
<style>
    #address {
        width: 450px;
        margin: 20px auto;
        padding: 20px;
        background-color: #f2f2f2;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    form {
        margin-top: 20px;
    }

    h3 {
        margin-bottom: 10px;
    }

    input[type="text"],
    input[type="radio"] {
        margin-bottom: 10px;
        padding: 8px;
        width: 95%;
        border: 1px solid none;
        border-radius: 4px;
        font-size: 14px;
    }

    input[type="submit"] {
        background-color: #ff9900;
        color: #fff;
        border: none;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        border-radius: 4px;
    }
</style>
</head>
<body>
<% if(session.getAttribute("email") == null){
    response.sendRedirect("MainPage.jsp");
} else {
%>
    <header id="head">
        <h2>Amazon</h2>
        <% 
        String email = (String) session.getAttribute("email");
        String username = (String) session.getAttribute("username");
        /* session.setAttribute("email", email); */
        System.out.println(email+"1");
        /* session.setAttribute("username", username); */
        if (email != null) { 
        %>
        <div id="user-info">
            Welcome, <%= username %>!
            <a href="Cart.jsp">Cart</a>
        </div>
        <% } %>
    </header>

    <div id="address">
        <form action="payment">
            <h3>Delivery Address:</h3>
            <input type="text" name="name" placeholder="Name" required><br>
            <input type="text" name="firstline" placeholder="Address Line 1" required><br>
            <input type="text" name="secondline" placeholder="Address Line 2" required><br>

            <h3>Payment Method:</h3>
            <input type="radio" name="payment" value="Google Pay" id="googlepay">
            <label for="googlepay">Google Pay</label><br>
            <input type="radio" name="payment" value="Phonepe" id="phonepe">
            <label for="phonepe">PhonePe</label><br>
            <input type="radio" name="payment" value="Card" id="card">
            <label for="card">Card</label><br>
            <input type="radio" name="payment" value="Cash on Delivery" id="cod">
            <label for="cod">Cash on Delivery</label><br>

            <input type="submit" value="Proceed to Payment">
        </form>
    </div>
<% } %>
</body>
</html>
