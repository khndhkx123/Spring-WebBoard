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
	$(document).ready(function(){
		$('.addCart').on('click', function(){
			var qt_no = $("#sbox").val();
			var cart_stock = $(".onum").val();
			
			var data = {
					qt_no : qt_no,
					cart_stock : cart_stock,
					};

			$.ajax({
				url : "/shop/addCart",
				type : "post",
				data : data,

				success : function(){
					alert("장바구니 담기 성공");
					window.location = '/shop/cartlist';
					},
				error : function(){
					alert("장바구니 담기 실패");
					window.location = '/shop/cartlist';
					}
				});
		});

		$('.deleteCart').on('click', function(){
			var confirm_val = confirm("장바구니에서 삭제하시겠습니까 ?");
			if(confirm_val){
				var cart_no = $(this).attr("value");
				}
			$.ajax({
				url : "/shop/deleteCart",
				type : "post",
				data : {cart_no : cart_no},
				
				success : function(){
					alert("장바구니에서 삭제가 완료되었습니다.");
					location.href = "/shop/cartlist";
				}
			});
		})

		$('.addOrder').on('click', function(){
			var confirm_val = confirm("정말 이대로 주문하시겠습니까 ? 주문취소는 어려울 수 있습니다.");
			if(confirm_val){
				var total_price = $(this).attr("value");
			}
			$.ajax({
				url : "/shop/addOrder",
				type : "post",
				data : {total_price : total_price},

				success : function(){
					alert("주문이 접수 되었습니다. 기원형제가 확인후 처리하겠습니다 ^^");
					window.location = '/shop/cartlist';
					},
				error : function(){
					alert("주문 접수 실패 ㅠㅠ. 기원형제에게 연락주세요 ㅠㅠ");
					window.location = '/shop/cartlist';
				}
			});
		});

		$('.orderlist').on('click', function(){ window.location = '/shop/orderlist'; });
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
				<td>주문자</td>
				<td>주문상품</td>
				<td>상품수량</td>
				<td>가격</td>
				<td>삭제</td>
			</tr>
		</thead>

		<tbody><!-- 지금은 list 로 잘되는지 확인했지만 앞으로는 로그인 했던 사람의 장바구니를 실시간으로 보여줄 계획 -->
			<c:set var="sum" value = "0"/>
			<c:set var="order_name" value = ""/>
			<c:forEach items="${cartlist}" var="cartlist">
				<tr>
					<td>${cartlist.mb_name}</td>
					<td>${cartlist.qt_name}</td>
					<td>${cartlist.cart_stock}</td>
					<td><fmt:formatNumber pattern="###,###,###" value="${cartlist.qt_price * cartlist.cart_stock}" /> 원</td>
					<td><button type="button" class="deleteCart" value="${cartlist.cart_no}">삭제</button></td>
				</tr>
				<c:set var="sum" value="${sum + (cartlist.qt_price * cartlist.cart_stock)}"/>
				<c:set var="order_name" value="${cartlist.mb_name}"/>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
				<td>총 주문금액 : </td>
				<td><fmt:formatNumber pattern="###,###,###" value="${sum}" /> 원</td>
			</tr>
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
	<!-- 장바구니에 넣기 & 주문넣기 버튼 -->
	<input type="number" class="onum" placeholder="수량입력">
	<button type="button" class="addCart" style="margin-left: 39%;">장바구니에 넣기</button>
	<button type="button" class="addOrder" value="${sum}">이대로 주문 넣기</button>
	<button type="button" class="orderlist">주문 현황 보기</button>

</body>

</html>