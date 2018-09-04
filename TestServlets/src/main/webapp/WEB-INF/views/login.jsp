<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<html>
<head>
<style>
body {
    background-color: linen;
}

h1 {
    color: white;
    text-align: center;
}

p {
    font-family: verdana;
    font-size: 40px;
}
</style>
	<title>Join</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form:form modelAttribute = "testvo" action="loginform" method = "POST" >
<h1>${testvo.id}</br>
${testvo.pwd}</br>
${testvo.name}</br>
${testvo.phone}</br>
${testvo.postno}</br></h1>

<input type = "submit" value = "확인">
</form:form>
</body>
</html>
