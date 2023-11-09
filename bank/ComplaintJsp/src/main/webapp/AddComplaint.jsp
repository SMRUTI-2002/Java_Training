<%@page import="com.jsp.compliant.ComplaintDAOImpl"%>
<%@page import="com.jsp.compliant.ComplaintDAO"%>
<%@page import="com.jsp.compliant.ComplaintBeans"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
	<form method="post" action="AddComplaint.jsp">
		<center>
			 <h1>Add Complaint</h1>
			 <table>
			 
			 	<tr>
			 	<th> ComplaintType : </th>
			 	<td>
			 		<input type="text" name="ComplaintType">
			 	</td>
			 	</tr>
			 	
			 	
			 	<tr>
			 	<th> CDescription : </th>
			 	<td>
			 		<input type="text" name="CDescription">
			 	</td>
			 	</tr>
			 	
			 	<tr >
			 	<td >
			 	<th > Severity :  
			 	<select name="severity">
			 		<option value="Low">Low</option>
			 		<option value="Medium">Medium</option>
			 		<option value="High">High</option>
			 	</select> 
			 	</th >
			 	</td>
			 	</tr>
			 	
			 	 <tr>
                <td colspan="2">
                    <input type="submit" name="submit">
                </td>
            </tr>
			 	
			 </table>
		</center>
	</form>
	
	 <%
        if (request.getParameter("ComplaintType")!=null && request.getParameter("CDescription")!=null) {
          ComplaintBeans beans = new ComplaintBeans();
          //beans.setComplaintID(request.getParameter("complaintID"));
          beans.setComplaintType(request.getParameter("ComplaintType"));
          beans.setcDescription(request.getParameter("CDescription"));
          beans.setSeverity(request.getParameter("severity"));
          //beans.setStatus(request.getParameter("status")); 
          
          ComplaintDAO dao = new ComplaintDAOImpl();
       		dao.addComplaintDao(beans);
    %>
      <jsp:forward page = "ComplaintShow.jsp"/>
    <%
        }
    %>
	
</body>
</html>