<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=1.0">
<title>주문 게시판 리스트</title>

<!-- !!!!! EXTERNAL CSS !!!!! -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap-theme.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- !!!!! EXTERNAL CSS !!!!! -->

</head>

<body>
	<div id="root">
		<header id="header">
			<div id="header_box">
				<%@ include file="include/header.jsp" %>
			</div>
		</header>
		
		<nav id="nav">
			<div id="nav_box">
				<%@ include file="include/nav.jsp" %>
			</div>
		</nav>
		
		<section id="container">
			<div id="signup">
				<%@ include file="member/signup.jsp" %>
			</div>
			<div id="container_box">본문 영역</div>
		</section>
		
		<footer id="footer">
			<div id="footer_box">
				<%@ include file="include/footer.jsp" %>
			</div>
		</footer>
	</div>
</body>

</html>