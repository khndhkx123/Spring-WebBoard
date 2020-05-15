<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section id="container">
	<div id="container_box">
	
		<section id="content">
			<form role="form" method="post" autocomplete="off">
				<div class="input_area">
					<label for="mb_id">아이디</label> <input type="text" id="mb_id"
						name="mb_id" required="required" />
				</div>

				<div class="input_area">
					<label for="mb_pw">패스워드</label> <input type="password"
						id="mb_pw" name="mb_pw" required="required" />
				</div>

				<button type="submit" id="signin_btn" name="signin_btn">로그인</button>

				<c:if test="${msg == false}">
					<p style="color: #f00;">로그인에 실패했습니다.</p>
				</c:if>

			</form>
		</section>
		
	</div>
</section>