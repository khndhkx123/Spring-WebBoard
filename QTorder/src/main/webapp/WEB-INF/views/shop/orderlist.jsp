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

<script>
/*
	$(document).ready(function() {
		$('.deleteOrder').on('click', function() {
			var confirm_val = confirm("주문을 삭제하시겠습니까?");
			if(confirm_val){
				var cart_no = $(this).attr("value");
			}
			$.ajax({
				url : "/shop/deleteorder",
				type : "post",
				data : {cart_no : cart_no}

				success : function() {
					alert("장바구니 담기 성공");
					window.location = '/shop/cartlist';
				},
				error : function() {
					alert("장바구니 담기 실패");
					window.location = '/shop/cartlist';
				}
			});
		});
	});
	*/
</script>

</head>

<body>

	<div class="container">
		<h2 class="mt-sm-5">아둘람 큐티 주문서</h2>
	</div>

	<table class="table text-center"><!-- 작성된 내용(글) 이 모두 중앙으로 정렬 -->
		<thead class="table-dark"><!-- 테이블의 색갈을 다크로 지정한다. -->
			<tr>
				<td>주문번호</td>
				<td>주문자</td>
				<td>주문금액</td>
				<td>주문접수일자</td>
			</tr>
		</thead>

		<tbody><!-- 지금은 list 로 잘되는지 확인했지만 앞으로는 로그인 했던 사람의 장바구니를 실시간으로 보여줄 계획 -->
			<c:forEach items="${orderlist}" var="orderlist">
				<tr>
					<td>${orderlist.order_no}</td>
					<td>${orderlist.mb_name}</td>
					<td><fmt:formatNumber pattern="###,###,###" value="${orderlist.total_price}" /> 원</td>
					<td>${orderlist.o_date}</td>
					<!-- <td><button type="button" class="deleteOrder" value="${orderlist.order_no}">삭제</button></td> -->
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<!-- 메인으로 돌아가기 버튼 -->
</body>

</html>