<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<ul>
	<c:if test="${member == null}">
		<li><a href="/member/signin">로그인</a></li>
		<li><a href="/member/signup">회원가입</a></li>
	</c:if>

	<c:if test="${member != null}">

		<c:if test="${member.mb_ident == 0}">
			<li>관리자 ${member.mb_name}님 환영합니다.</li>
			<!-- 
			<li><a href="/order/Alllist">전체주문보기</a>
			<li><a href="/order/Alldelete">전체주문삭제</a>
			<li><a href="/order/Addorder">주문추가</a>
			 -->
		</c:if>
		
		<c:if test="${member.mb_ident == 1}">
			<li>${member.mb_name}목사님 환영합니다.</li>
			<!-- 전체 주문을 조회하는 란 
			<li><a href="/order/Alllist">전체주문보기</a>
			 -->
		</c:if>
		
		<c:if test="${member.mb_ident == 2}">
			<li>성도 ${member.mb_name}님 환영합니다.</li>
		</c:if>
		
		<li>
			<a href="/member/signout">로그아웃</a>
		</li>
		
	</c:if>
</ul>