<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{
border: 0.5 px solid black;
}
td{
text-align: center;


}
</style>
</head>
<body>
<h1 align="center">${title }</h1>
<div class="container" align="center">
<table class="table" style="width: 700px;">
<thead>
<th>particulars</th>
<th>debit</th>
<th>credit</th>
</thead>
<c:forEach items="${list}" var="l">
<tr>
<td><br>TO&nbsp;&nbsp; ${l.TO }<br>&nbsp;&nbsp;BY&nbsp;&nbsp;${l.BY }</td>
<td>${l.debit } </td>
<td><br>${l.credit }</td>
</tr>
</c:forEach>
</table>
 </div>
</body>
</html>