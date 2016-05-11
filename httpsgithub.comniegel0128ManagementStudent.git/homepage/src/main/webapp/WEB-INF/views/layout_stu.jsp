<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
	<meta charset="UTF-8" />
	<title>사용자 페이지</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<link href="${css}/login.css" rel="stylesheet">
</head>
<body>
<!-- style="border:3px solid red;" -->
	<div id="header"><tiles:insertAttribute name="header" />
	</div>
	<div id="content">
	<tiles:insertAttribute name="content" />
	</div>
	<div id="footer" style="text-align:center">
	<tiles:insertAttribute name="footer" />
	</div>
</body>
<script src="${js}/Signup.js}"></script>
</html>
