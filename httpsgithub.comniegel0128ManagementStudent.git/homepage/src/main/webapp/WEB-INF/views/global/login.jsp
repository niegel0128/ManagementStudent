<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <div class="container">
   <form class="form-signin" method="post">
     <h2 class="form-signin-heading">로그인</h2>
     <input type="text" id="id" name="id" class="form-control" placeholder="Id" required value="">
     <input type="password" id="password" name="password" class="form-control" required placeholder="Password" value="">
     <button class="btn btn-lg btn-primary btn-block" id="loginButton">확인</button>
     <button class="btn btn-lg btn-primary btn-block" id="signupButton" >회원가입</button>
   </form>
 </div>
<script src="${js}/student.js"></script>
<script>
	$(function() {
		student.login('${context}');
		student.join('${context}');
		//student.main('${context}');
	});
</script>