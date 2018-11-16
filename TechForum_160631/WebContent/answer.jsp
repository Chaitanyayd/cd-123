<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form method="post" action="answerquery" modelAttribute="my">

<h1>Gear Technical Forum</h1><br></br>
<h2>Answer the Query</h2><br></br>
<table>
< <tr>
<td>Query Id:</td>
<td><input type="text" name=/></td>
</tr>

<tr>
<td>Select Technology:</td>

</tr>

<tr>
<td>Question:</td>
<td><input type="text"/></td>
</tr>

<tr>
<td>Question Raised By:</td>

</tr>


<tr>
<td>Solution:</td>
<td><input type="text" name="solutions"/></td>
</tr>

<tr>
<td>Answered by:</td>

</tr>
<tr>
<td><input type="submit" value="Update Query"></input></td>
</tr>
</table>

</for:form>
</body>
</body>
</html>