<%@page import="com.jsp.compliant.ComplaintBeans"%>
<%@page import="com.jsp.compliant.ComplaintDAOImpl"%>
<%@page import="com.jsp.compliant.ComplaintDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
	<form method="post" action="SearchComplaint.jsp">
		<center>
			<h1>Search Complaint :</h1>
			<table>
			<tr>
				<th>ComplaintID</th>
				<td><input type="text" name="complaintID"></td>
			</tr>
			
			 <tr>
			 
                <td colspan="3">
                <center>
                    <input type="submit" name="submit">
                    </center>
                </td>
               
            </tr>
			
			</table>
		</center>
	</form>
	
	<%
		String complaintID =  request.getParameter("complaintID");
		ComplaintDAO dao = new ComplaintDAOImpl();
		ComplaintBeans complaint = dao.searchComplaintDao(complaintID);
		if(complaintID!=null){
		%>
			
				<table border="3" align="center">
<tr>
		<th>complaintID</th>
		<th>complaintType</th>
		<th>cDescription</th>
		<th>complaintDate</th>
		<th>severity</th>
		<th>status</th>
</tr>
		<tr>
		<td><%=complaint.getComplaintID() %></td>
		<td><%=complaint.getComplaintType() %></td>
		<td><%=complaint.getcDescription() %></td>
		<td><%=complaint.getComplaintDate() %></td>
		<td><%=complaint.getSeverity() %></td>
		<td><%=complaint.getStatus() %></td>		
		</tr>
		</table>
	<%	
		}
	%>
		
	
</body>
</html>