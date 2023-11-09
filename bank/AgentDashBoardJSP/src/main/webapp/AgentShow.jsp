<%@page import="com.java.jsp.Agent"%>
<%@page import="java.util.List"%>
<%@page import="com.java.jsp.AgentDAOImpl"%>
<%@page import="com.java.jsp.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
		AgentDAO dao = new AgentDAOImpl();
		List<Agent> agentList = dao.showAgentDao();
	%>
	<table border="3" align="center">
		<tr>
			<th>Agent Id</th>
			<th>Agent Name</th>
			<th>City</th>
			<th>Gender</th>
			<th>MaritalStatus</th>
			<th>Premium</th>
			<th>Update</th>
			<th>Delete</th>
			
			
		</tr>
		<%
			for(Agent agent : agentList) {
		%>
			<tr>
				<td><%=agent.getAgentId() %> </td>
				<td><%=agent.getName() %> </td>
				<td><%=agent.getCity() %> </td>
				<td><%=agent.getGender() %> </td>
				<td><%=agent.getMaritalStatus() %> </td>
				<td><%=agent.getPremium() %> </td>
				<td>
				<a href=UpdateAgent.jsp?agentid=<%=agent.getAgentId()%>>Update</a>
				</td>
				<td>
				<a href=DeleteAgent.jsp?agentid=<%=agent.getAgentId()%>>Delete</a>
				</td>
			
			</tr>
		<%
			}
		%>
	</table><hr/>
	<a href="AddAgent.jsp">Add Employ</a>


</body>
</html>