<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.java.infinite.Customer"%>
<%@page import="com.java.infinite.CustomerDAO"%>
<%@page import="com.java.infinite.CustomerDAOImpl"%>
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
   int CustomerId = Integer.parseInt(request.getParameter("customerId"));
   CustomerDAO dao = new CustomerDAOImpl();
   Customer customer = dao.searchCustomerDao(CustomerId);
%>
<form method = "post" action ="CustomerUpdate.jsp">
  <center>
  CustomerId:
       <input type = "number" name = "customerId" readonly="readonly"
       value=<%=customer.getCustomerId() %> /> <br/><br/>
  Employ Name:
       <input type = "text" name = "Name" 
       value=<%=customer.getName() %> /> <br/><br/>
  CheckIn Date:
       <input type = "text" class = "datepicker" name="checkIn"
       value=<%=customer.getCheckIn() %> /> <br/><br/>
   CheckOut Date:
       <input type = "text" class = "datepicker" name="checkOut"
       value=<%=customer.getCheckOut() %> /> <br/><br/>
  Room No:
        <input type = "text" name = "roomNo" 
       value=<%=customer.getRoomNo() %> /> <br/><br/>
       <input type ="submit" value = "UPDATE" />
  </center>
</form>
<%
    if(request.getParameter("customerId")!=null){
    	try{
    		Customer customerUpdated = new Customer();
    		customerUpdated.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
    		customerUpdated.setName(request.getParameter("customerName"));
    		customerUpdated.setCheckIn(Date.valueOf(request.getParameter("checkIn")));
    		customerUpdated.setCheckOut(Date.valueOf(request.getParameter("checkOut")));
    		customerUpdated.setRoomNo(Integer.parseInt(request.getParameter("roomNo")));
    		dao.updateCustomerDAO(customerUpdated);
    		response.sendRedirect("customerShow.jsp");
    	} catch (Exception e){
    		out.println("Error updatong customer: "+ e.getMessage());
    	}
    	
    }
%>
</body>
</html>