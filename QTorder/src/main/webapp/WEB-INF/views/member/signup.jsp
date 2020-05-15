<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<section id="content">
 <form role="form" method="post" autocomplete="off">
 
  <div class="input_area">
   <label for="mb_name">성함</label>
   <input type="text" id="mb_name" name="mb_name" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="mb_id">아이디</label>
   <input type="text" id="mb_id" name="mb_id" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="userName">비밀번호</label>
   <input type="password" id="mb_pw" name="mb_pw" required="required" />      
  </div>
  
  <button type="submit" id="signup_btn" name="signup_btn">회원가입</button>
  
 </form>   
</section>