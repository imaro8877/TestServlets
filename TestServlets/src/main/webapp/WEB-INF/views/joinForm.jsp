<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>body {
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
        이름<br/>
        <form:input path="name"/>
    </p>
    <p>
        휴대폰번호<br/>
        <form:input path="phone"/>
    </p>
    <p>
       우편번호<br/>
        <form:input path="postno"/>
    </p>
    <p>
        <input type="submit" value="Submit">
    </p>
</form:form>
 
</body>
</html>