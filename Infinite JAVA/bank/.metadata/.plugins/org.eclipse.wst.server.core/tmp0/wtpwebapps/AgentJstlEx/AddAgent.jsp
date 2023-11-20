<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddAgent.jsp">
		<center>
			Agent No : 
			<input type="Id" name="AgentId" /> <br/><br/>
			Agent Name : 
			<input type="text" name="name" /> <br/><br/> 
			Agent Id: <input type="number" name="agentId" /><br /> <br />
			Agent Name: <input type="text" name="name" /><br /> <br /> 
			City: <input type="text" name="city" /><br /> <br /> 
				Gender: <select name="gender">
				<option value="MALE">Male</option>
				<Option value="FEMALE">Female</Option>
				</select>
				<br />
				<br /> 
				MaritalStatus :
				<select name="maritalStatus">
					<option value="0">0</option>
					<option value="1">1</option>
			Premium : 
			<input type="number" name="basic" /> <br/><br/> 
			<input type="submit" value="Add Employ" />
		</center>
	</form>
	<c:if test="${param.agentid!=null && param.premium!=null}">
		<sql:setDataSource var="connection"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/infinite_august23"
	user="root"
	password="india@123" />
			<sql:update var="agentUpdate" dataSource="${connection}">
		Insert into Agent(agentid,name,city,gender,maritalstatus,premium) values(?,?,?,?,?,?)
		<sql:param value="${param.agentid}" />
		<sql:param value="${param.name}" />
		<sql:param value="${param.city}"/>
		<sql:param value="${param.gender}" />
		<sql:param value="${param.maritalstatus}" />
		<sql:param value="${param.premium}" />
	</sql:update>
	<c:out value="Record Inserted..." />
		
	</c:if>
</body>
</html>