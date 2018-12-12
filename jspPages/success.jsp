<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Successfully Login.</h3>

<a href="showwalletbal?custPhoneNum=${mobnum}" >SHOW WALLET BALANCE</a>
<c:if test="${walletBalMsg!=null}">
<h6>${walletBalMsg}</h6>
</c:if>
<br/>
<a href="deposit?custPhoneNum=${mobnum}" >DEPOSIT AMOUNT</a><br/>
<a href="withdraw?custPhoneNum=${mobnum}" >WITHDRAW AMOUNT</a><br/>
<a href="transfer?custPhoneNum=${mobnum}" >TRANSFER FUNDS</a><br/>
<a href="printtrans?custPhoneNum=${mobnum}" >PRINT TRANSACTIONS</a><br/>
<a href="showbankbal?custPhoneNum=${mobnum}" >SHOW BANK BALANCE</a><br/>
<c:if test="${BankBalMsg!=null}">
<h6>${BankBalMsg}</h6>
</c:if>
<a href="all" >LOGOUT</a>

</body>
</html>