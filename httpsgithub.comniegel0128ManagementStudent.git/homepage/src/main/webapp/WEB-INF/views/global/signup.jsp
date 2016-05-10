<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
   <form class="form-signin">
     <h2 class="form-signin-heading">회원가입</h2>
     <label for="id" class="sr-only">Id</label>
     <input type="text" id="id" name="id" class="form-control" placeholder="Id" required autofocus="">
     <label for="password" class="sr-only">Password</label>
     <input type="password" id="password" name="password" class="form-control" required placeholder="Password">
     <label for="repassword" class="sr-only">Password</label>
     <input type="password" id="repassword" name="repassword" class="form-control" required placeholder="repassword">
     <label for="name" class="sr-only">name</label>
     <input type="text" id="name" name="name" class="form-control" placeholder="name" required autofocus="">
     <label for="tel" class="sr-only">tel</label>
     <input type="text" id="tel" name="tel" class="form-control" placeholder="tel" required autofocus="">
     <label for="email" class="sr-only">email</label>
     <input type="text" id="email" name="email" class="form-control" placeholder="email" required autofocus="">
     <label for="profile_img" class="sr-only">email</label>
     <input type="text" id="profile_img" name="profile_img" class="form-control" placeholder="profile_img" required autofocus="">
     <button class="btn btn-lg btn-primary btn-block" id="signupButton" type="submit">확인</button>
     <button class="btn btn-lg btn-primary btn-block" id="resetButton" type="reset">취소</button>
   </form>
 </div>
