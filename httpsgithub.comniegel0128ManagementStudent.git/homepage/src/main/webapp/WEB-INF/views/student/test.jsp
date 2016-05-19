<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>    

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	
</body>
</html>
   <script type="text/javascript">
<!--

//-->

<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://niegel0128.cpxspsymefko.us-west-2.rds.amazonaws.com:3306/ms?characterEncoding=UTF-8","niegel0128","niegel0128");  
	stmt = conn.createStatement();
	rs = stmt.executeQuery("select seq,label,fillColor,strokeColor,pointColor,pointStrokeColor,pointHighlightFill,pointHighlightStroke,data1,data2,data3,data4,data5 from graph");
	String sample = "";
	while (rs.next()) {
		sample = rs.getString("label");
	}
	System.out.println("샘플 : "+sample);
	
} catch (Exception e) {
	System.out.println("테스트 에러발생");
	e.printStackTrace();
} 


%>
</script>