<%@page import="com.java.infinite.Customer"%>
<%@page import="com.java.infinite.CustomerDAOImpl"%>
<%@page import="com.java.infinite.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
    int customerId = Integer.parseInt(request.getParameter("customerId"));
    CustomerDAO dao = new CustomerDAOImpl();
  	Customer customer = dao.searchCustomerDao(customerId);
  	if (customer != null){
  		dao.deleteCustomer(customerId);
  	%>
  	<jsp:forward page="CustomerShow.jsp"/>
  	<c:out value="customer Details are Deleted..."/>
  	<% 
  	}else{
  		%>
  		<c:out value="Customer Not Found..."/>
  		<% 
  	} 
%>
 
  	
</body>
</html>