<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
  	<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="${context}/student/main">학생관리 페이지</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="${context}/student/cboard">수강자료 게시판</a></li>
            <li><a href="${context}/student/graph">출석 그래프</a></li>
            <li><a href="${context}/student/calendar">일정표</a></li>
            <li><a href="${context}/student/newitem">상세일정</a></li>
            <li><a href="${context}/student/logout">로그아웃</a></li>
          </ul>
        </div>
      </div>
    </nav>
