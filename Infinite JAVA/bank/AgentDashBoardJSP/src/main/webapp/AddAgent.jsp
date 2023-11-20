<%@page import="com.java.jsp.Agent"%>
<%@page import="java.util.List"%>
<%@page import="com.java.jsp.AgentDAOImpl"%>
<%@page import="com.java.jsp.Gender"%>
<%@page import="com.java.jsp.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form method="get" action="AddAgent.jsp">
	<center>
		Agent No : 
		<input type="number" name="agentid" /> <br/><br/>
		Agent Name : 
		<input type="text" name="name" /> <br/><br/>
		City : 
		<input type="text" name="city" /> <br/><br/>
		Gender : 
		<select name="gender">
			<option value="MALE">Male</option>
			<option value="FEMALE">Female</option>
		</select> <br/><br/>
		Marital status : 
		<select name="maritals">
		<option value="0">0</option>
		<option value="1">1</option>
		</select> <br/><br/>
		Premium : 
		<input type="number" name="premium" />
		<br/><br/>
		<input type="submit" value="Add Agent" />
	</center>
</form>
<%
if(request.getParameter("agentid")!=null && 
request.getParameter("premium")!=null){
	AgentDAO dao = new AgentDAOImpl();
	Agent agent=new Agent();
	agent.setAgentId(Integer.parseInt(request.getParameter("agentid")));
	agent.setName(request.getParameter("name"));
	agent.setCity(request.getParameter("city"));
	agent.setGender(Gender.valueOf(request.getParameter("gender")));
	agent.setMaritalStatus(Integer.parseInt(request.getParameter("maritals")));
	agent.setPremium(Double.parseDouble((request.getParameter("premium"))));
	dao.createAgentDao(agent);
	
	%>
	<jsp:forward page="AgentShow.jsp"/>
	<%
	

}
%>

</body>
</html>