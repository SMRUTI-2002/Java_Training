<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "get" action = "CaseDemo.jsp">
  <center>
      Enter your choice:
      <input type = "number" name = "sno"/> <br/><br/>
      <input type = "submit" value = "show"/>
  </center>
  
  </form>
  
  <c:if test = "${param.sno!=null }">
    <c:set var = "sno" value = "${param.sno }"/>
    <c:choose>
       <c:when test = "${sno==1 }">
            <c:out value = "Smruti"/>
       </c:when>
      <c:when test = "${sno==2 }">
            <c:out value = "Puja"/>
       </c:when> 
       <c:otherwise>
            <c:out value="Invalid Choice"/>
       </c:otherwise>
     </c:choose>
  </c:if>
       
</body>
</html>