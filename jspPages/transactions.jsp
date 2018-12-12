<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>

<tr>
<th>Transaction Id</th>
<th>Transaction Type</th>
<th>Transaction Amount</th>
</tr>

<a:forEach var="trans" items="${transList}">
<tr>
<td>${trans.transId}</td>
<td>${trans.transType}</td>
<td>${trans.transAmount}</td>
</tr>
</a:forEach>

</table>

</body>
</html>