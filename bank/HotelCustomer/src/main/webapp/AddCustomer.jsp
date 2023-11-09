<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.java.infinite.CustomerDAOImpl"%>
<%@page import="com.java.infinite.CustomerDAO"%>
<%@page import="com.java.infinite.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="AddCustomer.jsp">
		<center>
			Customer Id:
			 <input type="number" name="customerId" /><br /> <br />
			Customer Name:
			 <input type="text" name="customerName" /><br /> <br /> 
			Enter checkIn Date:
			 <input type="text" class= "datepicker" name="checkIn" /><br /> <br /> 
			Enter checkOut Date:
			 <input type="text" class= "datepicker" name="checkOut" /><br /> <br />  
			Room No.: 
			<input type="number" name="roomNo" /><br /> <br /> 
			<input type = "submit" value = "submit" />
		</center>
	</form>
	<%
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	 
    	 
		if (request.getParameter("customerId")!=null  && 
			request.getParameter("checkInTime") != null && 
			request.getParameter("checkOutTime") != null){
			Customer customerUpdate = new Customer();
	        customerUpdate.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
	        customerUpdate.setName(request.getParameter("name"));
	        customerUpdate.setCheckInTime(checkIn);
	        customerUpdate.setCheckOutTime(checkout);
	        customerUpdate.setRoomNumber(Integer.parseInt(request.getParameter("RoomNumber")));
	        CustomerDAO dao = new CustomerDAOImpl();
	        dao.updateCustomer(customerUpdate);
		}
	%>

</body>
</html>