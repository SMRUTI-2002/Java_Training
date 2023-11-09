<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <form>
    <center>
      UserName:
      <input type ="text " name = "userName" /> <br/><br/>
      Password:
      <input type ="password" name = "password" /> <br/><br/>
      <input type ="submit" name = "Login" /> 
    </center>
  
  </form>
  
  <%
  if (request.getParameter("userName")!=null &&
		  request.getParameter("userName")!=null
		  ) {
  
  String userName = request.getParameter("userName");
  String pwd = request.getParameter("password");
  if (userName.equals("infinite") && pwd.equals("infinite")){
  %>

  <jsp:forward page = "Menu.jsp"/>
  <%
  } else{
	  
	  out.println("Invalid Credentials...");
	  
  }
  
  }
  
  %>

</body>
</html>