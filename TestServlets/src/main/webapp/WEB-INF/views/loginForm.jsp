<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<html>
<head>
</head>
<body>
 
<form:form modelAttribute="testvo" action="join" method="POST">
    <p>
        ID<br/>
        <form:input path="id"/>
    </p>
    <p>
        비밀번호<br/>
        <form:input path="pwd"/>
    </p>
    <p>
        <input type="submit" value="Submit">
    </p>
</form:form>
 
</body>
</html>