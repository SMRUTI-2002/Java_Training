<%@page import="com.java.infinite.CustomerDAOImpl"%>
<%@page import="com.java.infinite.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.java.infinite.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Check-in and Check-out</title>
</head>
<body>
<%

    CustomerDAO dao = new CustomerDAOImpl();
    List<Customer> customerList = dao.showCustomerDao();
   
%>

<table border="3" align="center">
    <tr>
        <th>Customer ID</th>
        <th>Name</th>
        <th>Check-In Time</th>
        <th>Check-Out Time</th>
        <th>Room Number</th>
         <th>Delete</th>
    </tr>
    <%
        for (Customer customer : customerList) {
        	
    %>
    
    <tr>
        <td><%=customer.getCustomerId() %></td>
        <td><%=customer.getName() %></td>
        <td><%=customer.getCheckInTime() %></td>
        <td><%=customer.getCheckOutTime() %></td>
        <td><%=customer.getRoomNumber() %></td>
        <td>
        	<a href= DeleteCustomer.jsp?customerId=<%=customer.getCustomerId() %> >Delete</a>
        </td>
    </tr>
    <%
    
        }
    
    %>
</table>
</body>
</html>