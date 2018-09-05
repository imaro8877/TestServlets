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
<c:forEach items="${testvo}" var="testlist"  varStatus = "status">
${testlist.id} ${testlist.pwd} ${testlist.name} ${testlist.phone} ${testlist.postno}  </br>
<%-- ${testvo.id} ${testvo.pwd} ${testvo.name} ${testvo.phone} ${testvo.postno} </br> --%>
</c:forEach>

<c:forEach var="i" begin="1" end="100" varStatus = "status">
 Line ${status.current} ${i} ${status.begin} ${status.count} ${status.first} ${status.count} ${status.index} <br/>
</c:forEach>

<input type = "submit" value = "확인">
</body>
</html>
