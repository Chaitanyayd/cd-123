<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<for:form method="post" action="createaccdata" modelAttribute="cust1">
<table>

<tr>
<td>Enter Mobile number</td>
<td><for:input path="customerPhoneNum"/></td>
</tr>

<tr>
<td>Enter Password</td>
<td><for:input path="custPassword"/></td>
</tr>

<tr>
<td>Enter your Name</td>
<td><for:input path="customerName"/></td>
</tr>

<tr>
<td>Enter Bank Account number</td>
<td><input type="number" name="bankacc" /></td>
</tr>

<tr>
<input type="submit" name="submit" />
</tr>

</table>

</for:form>
<a href="all" >Home</a>
</body>
</html>