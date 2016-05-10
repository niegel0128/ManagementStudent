<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <div class="container">

      <form class="form-signin">
        <h2 class="form-signin-heading">로그인</h2>
        <label for="id" class="sr-only">Id</label>
        <input type="text" id="id" name="id" class="form-control" placeholder="Id" required autofocus="">
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password">
        <!-- <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 암호 저장하기
          </label>
        </div> -->
        <button class="btn btn-lg btn-primary btn-block" id="loginButton" type="submit">확인</button>
      </form>
    </div>
<script>
	$(function() {
		alert('로그인 진입2');
	$('#loginButton').click(function() {
		alert('로그인 버튼클릭!');
		$('form').attr('action','${context}/student/login')
		.attr('method','post').submit();
		});
	});
</script>