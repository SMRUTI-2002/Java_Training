
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
<body>
 <%
      int agentid=Integer.parseInt(request.getParameter("agentid"));
      AgentDAO dao = new AgentDAOImpl();
      dao.deleteAgentDao(agentid);
    
    %>
    <jsp:forward page="AgentShow.jsp"></jsp:forward>

</body>
</html>