<%@page import="com.jsp.compliant.ComplaintBeans"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.compliant.ComplaintDAOImpl"%>
<%@page import="com.jsp.compliant.ComplaintDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
	function hello(){
	alert("Welcome to ShowAllComplaint🙄🙄");
		}
</script>



<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#ABEBC6" onload="hello()">
	
	<%
	ComplaintDAO dao = new ComplaintDAOImpl();
	List<ComplaintBeans> cList = dao.showComplaintDao();
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
	
	<%
		for(ComplaintBeans beans : cList){
		%>
		
		<tr>
			<td> <%=beans.getComplaintID() %> </td>
			<td> <%=beans.getComplaintType() %> </td>
			<td> <%=beans.getcDescription() %> </td>
			<td> <%=beans.getComplaintDate() %> </td>
			<td> <%=beans.getSeverity() %> </td>
			<td> <%=beans.getStatus() %> </td>			
		</tr>
	
		
	<% 
		}
	%>		
	</table>
	<table>
		<tr>
			<th><a href="SearchComplaint.jsp"/>Search</th>
		</tr>
	</table>
	
</body>
</html>