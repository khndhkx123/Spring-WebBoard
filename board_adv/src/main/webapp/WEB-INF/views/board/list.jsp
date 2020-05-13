<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=1.0">
<title>게시판 리스트</title>

<!-- !!!!! EXTERNAL CSS !!!!! -->
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- !!!!! EXTERNAL CSS !!!!! -->

<script>
	$(document).ready(function() {
		$('.move').on('click', function() {
			var data = $(this).attr('data');
			if(data == 'write'){
				location.href='/board/write';
			}
			else if(data == 'view'){
				var no = $(this).parent('tr').children('td:nth-of-type(1)').html();
				location.href='/board/view?no='+no;
			}
		});
	});
</script>

</head>
<body>

	<div class="container">
		<h2 class="mt-sm-5">게시판 리스트</h2>
		<button class="btn btn-primary float-right mb-sm-2 move" data="write">글작성</button><!-- 버튼 : 오른쪽으로 띄우기 -->
	</div>

	<table class="table text-center"><!-- 작성된 내용(글) 이 모두 중앙으로 정렬 -->
		<thead class="table-dark"><!-- 테이블의 색갈을 다크로 지정한다. -->
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>날짜</td>
				<td>조회수</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list }" var="list">
				<tr>
					<td>${list.no }</td>
					<td class="move text-left" style="cursor: pointer;" data="view"><!-- 클릭 가능하게 만든다 -->
					<c:if test="${list.indent > 0 }">
						<c:set value="${list.indent * 10 }" var="width"/>
						<img src="/resources/images/blank.png" width="${width }">
						<span>┗━</span>
					</c:if>
					${list.title }</td>
					<td>${list.id }</td>
					<td>${list.bDate }</td>
					<td>${list.count }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<ul class="pagination" style="margin-left: 42%;"><!-- 클릭 가능한 페이지 버튼 -->
		<c:if test="${page.pageNum > page.pageBlock }">
			<li class="page-item">
				<a class="page-link" href="/board/list?pageNum=${page.startPage-1 }">이전</a>
			</li>
		</c:if>
		
		<c:forEach begin="${page.startPage }" end="${page.endPage }" step="1" var="i">
			<li class="page-item
			<c:if test="${i eq page.pageNum }">active</c:if>">
			<a class="page-link" href="/board/list?pageNum=${i }">${i }</a>
			</li>
		</c:forEach>
		
		<c:if test="${page.endPage < page.pageCount }">
			<li class="page-item">
				<a class="page-link" href="/board/list?pageNum=${page.endPage+1 }">다음</a>
			</li>
		</c:if>
	</ul>

</body>
</html>