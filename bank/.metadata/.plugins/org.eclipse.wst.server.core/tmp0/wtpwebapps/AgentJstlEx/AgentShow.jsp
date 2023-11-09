<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="connection"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/infinite_august23"
	user="root"
	password="india@123"
/>
<sql:query var="agentQuery" dataSource="${connection}">
	select * from Agent
</sql:query>
</body>
<c:forEach var="agent" items="${agentQuery.rows}">
	Agent No :
	<c:out value="${agent.agentid}"/> <br/>
	Agent Name : 
	<c:out value="${employ.name}"/> <br/>
	City : 
	<c:out value="${employ.city}"/> <br/>
	Gender : 
	<c:out value="${employ.gender}"/> <br/>
	MaritalStatus : 
	<c:out value="${employ.maritalStatus}"/> <br/>
	Premium : 
	<c:out value="${employ.Premium}"/> <br/>
	
	<hr/>
</c:forEach>

</html>