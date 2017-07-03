<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Status</title>
</head>
<body>
<h1>Thank You</h1>
The details you submitted were:<br/><br/>
Name: ${contactRequest.name }<br/>
Email: ${contactRequest.email }<br/>
Details: ${contactRequest.details }<br/>
Employee: ${contactRequest.employee }<br/>
Urgent: ${contactRequest.urgent }<br/>
</body>
</html>