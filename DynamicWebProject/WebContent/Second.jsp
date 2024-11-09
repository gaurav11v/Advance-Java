<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%=request.getParameter("FirstName")%>
<%=request.getParameter("LastName")%>
<br>
<%=request.getParameter("LoginId")%>
<br>
<%=request.getParameter("Password")%>
<br>
<%=request.getParameter("Address")%>
<br>
<%=request.getParameter("Dob")%>


</body>
</html>