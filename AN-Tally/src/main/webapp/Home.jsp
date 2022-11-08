<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AN_Tally Home</title>
<style>
h1{
align-self:auto;
}
</style>
</head>
<body>
<h1 align="center">Welcome to AN_Tally</h1>
<div align="right">
<a href="viewacc" >VIEW ACCOUNTS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
</div>
<br>
<div class="container" align="center">
<form action="execute">
<div class="form-group">
<input type="text" name="transaction"  style="width: 700px;"class="form-control"/>&nbsp;<button type="submit" onclick="submit">execute</button>
</div>
</form>
</div>
<br>
${query }


</body>
</html>