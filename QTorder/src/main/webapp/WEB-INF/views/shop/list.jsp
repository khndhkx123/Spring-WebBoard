<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<script>
	$(document).ready(function(){
		$('.addCart').on('click', function(){
			var qt_no = $("#sbox").val();
			var cart_stock = $(".onum").val();

			console.log("qt_no : " + qt_no);
			console.log("cart_stock : " + cart_stock);
			
			var data = {
					qt_no : qt_no
					cart_stock : cart_stock
					};

			$.ajax({
				url : "/shop/list/addCart",
				type : "post",
				data : data,

				success : function(){
					alert("장바구니 담기 성공");
					$(".onum").val("1");
					},
				error : function(){
					alert("장바구니 담기 실패");
					$(".onum").val("1");
					}
				});
		});
	});
</script>

</head>

<body>

	<div class="container">
		<h2 class="mt-sm-5">상품 목록</h2>
	</div>

	<table class="table text-center"><!-- 작성된 내용(글) 이 모두 중앙으로 정렬 -->
		<thead class="table-dark"><!-- 테이블의 색갈을 다크로 지정한다. -->
			<tr>
				<td>상품번호</td>
				<td>상품정보</td>
				<td>상품가격</td>
			</tr>
		</thead>

		<tbody><!-- 지금은 list 로 잘되는지 확인했지만 앞으로는 로그인 했던 사람의 장바구니를 실시간으로 보여줄 계획 -->
			<c:forEach items="${list }" var="list">
				<tr>
					<td>${list.qt_no }</td>
					<td>${list.qt_name }</td>
					<td>${list.qt_price }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<select id="sbox" name="sbox" class="row mt-3 ml-5">
		<option value="0">상품 선택하기</option>
		<option value="1">작은글_일반</option>
		<option value="2">작은글_스프링</option>
		<option value="3">큰글_일반</option>
		<option value="4">큰글_스프링</option>
		<option value="5">청소년_일반</option>
		<option value="6">청소년_스프링</option>
		<option value="7">어린이_일반</option>
		<option value="8">어린이_스프링</option>
		<option value="9">큐티아이_일반</option>
		<option value="10">큐티아이_스프링</option>
	</select>
	<!-- 장바구니에 넣기 버튼 -->
	<input type="number" class="onum" placeholder="수량입력">
	<button type="button" class="addCart" style="margin-left: 39%;">장바구니에 넣기</button>

</body>

</html>