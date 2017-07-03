<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.codetest.test.EmployeeService" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<h1>Contact Request</h1>

<form method="GET" action="/submit">

<b>Name: </b> <input type="text" name="name"/><br/>
<b>Email: </b> <input type="text" name="email"/><br/>
Details:<br/>
<textarea rows="10" cols="100" name="details"></textarea>

<% 
EmployeeService es = new EmployeeService();
if (es.isEmployee(request.getRemoteAddr())) {
%>
<input type="hidden" name="employee" value="true"/>
<input type="checkbox" name="urgent" value="false" />
<%
} else {
%>
<input type="hidden" name="employee" value="false"/>
<input type="hidden" name="urgent" value="false"/>
<%
}
%>
<br/>
<input type="submit"/>
</form>

</body>
</html>