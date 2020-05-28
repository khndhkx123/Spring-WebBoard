<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=1.0">
<title>주문 게시판 리스트</title>

<!-- !!!!! EXTERNAL CSS !!!!! -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- !!!!! EXTERNAL CSS !!!!! -->

</head>

<body>

	<div class="container">
		<h2 class="mt-sm-5">전체 주문서</h2>
	</div>

	<table class="table text-center"><!-- 작성된 내용(글) 이 모두 중앙으로 정렬 -->
		<thead class="table-dark"><!-- 테이블의 색갈을 다크로 지정한다. -->
			<tr>
				<td>품목</td>
				<td>수량</td>
				<td>총금액</td>
			</tr>
		</thead>

		<tbody><!-- 지금은 list 로 잘되는지 확인했지만 앞으로는 로그인 했던 사람의 장바구니를 실시간으로 보여줄 계획 -->
			<c:forEach items="${ordercount}" var="ordercount">
				<tr>
					<td>${ordercount.qt_name}</td>
					<td>${ordercount.quantity}</td>
					<td><fmt:formatNumber pattern="###,###,###" value="${ordercount.total_price}" /> 원</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<!-- 메인으로 돌아가기 버튼 -->
</body>

</html>