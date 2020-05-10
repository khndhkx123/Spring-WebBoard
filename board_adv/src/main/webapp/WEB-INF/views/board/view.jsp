<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 보기</title>

<!-- !!!!! EXTERNAL CSS !!!!! -->
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- !!!!! EXTERNAL CSS !!!!! -->

</head>
<body>

	<div class="container">
		<h2 class="mt-sm-5">게시판 보기</h2>
		<button class="btn btn-primary mb-sm-2 list" style="margin-left: 39%;">목록</button>
		<button class="btn btn-primary mb-sm-2 ml-1 writereply">답글</button>
		<input type="hidden" id="no" value="${board.no }">
		<input type="hidden" id="gNo" value="${board.gNo }">
		<input type="hidden" id="step" value="${board.step }">
		<input type="hidden" id="indent" value="${board.indent }">
		<input type="text" class="form-control w-50 mb-sm-1" readonly="readonly" value="${board.title }">
		<input type="text" class="form-control w-50 mb-sm-1" readonly="readonly" value="${board.id }">
		<textarea rows="10" class="form-control w-50 mb-sm-1" readonly="readonly">${board.content }</textarea>
		
		
		<div class="row mt-3 ml-5">
			<form class="form-inline" name="commentForm">
				<input type="hidden" name="bNo" value="">
				<input type="text" class="w-25 comments_writer" name="id" placeholder="작성자">
				<input type="text" class="w-50 comments_content" name="content" placeholder="내용">
				<button type="button" class="ml-4 btn btn-danger writecomments">작성</button>
			</form>
		</div>
		
		<div class="comments_list">
			<div class="row mt-1">
				<div class="col-2">kioni</div>
				<div class="col-3">하하</div>
				<div class="col-3">2020-05-09</div>				
			</div>
		</div>
		
	</div>

</body>
</html>