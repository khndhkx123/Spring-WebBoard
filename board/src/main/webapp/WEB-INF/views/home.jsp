<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>

<!-- GET will action listAll function -->
<form action = "listAll" method="get">
<body>

<!-- ADD Button -->
<button type = "submit">게시판 가기</button>

<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</form>
</html>