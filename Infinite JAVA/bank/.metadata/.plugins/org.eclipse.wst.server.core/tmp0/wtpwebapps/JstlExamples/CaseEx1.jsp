<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <c:set var = "x" value = "11"/>
   <c:choose>
      <c:when test = "${x==1}">
          <c:out value = "SubhraPrakash"/>
       </c:when>
      <c:when test = "${x==2}">
          <c:out value = "Smruti"/>
       </c:when>
       <c:when test = "${x==3}">
          <c:out value = "Sudha"/>
       </c:when>
       <c:when test = "${x==4}">
          <c:out value = "Prakash"/>
       </c:when>
       <c:when test = "${x==5}">
          <c:out value = "subbha"/>
       </c:when>
       <c:otherwise>
       <c:out value = "sona"/>
       </c:otherwise>
    </c:choose>c:choose>
</body>
</html>