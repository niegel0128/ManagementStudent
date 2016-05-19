<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title></title>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
	<script src="${js}/Chart.min.js"></script>
</head>
<body>
	<div style="width: 60%">
		<canvas id="canvas" height="450" width="600"></canvas>
	</div>
	<input type="button" id="btnAdd" value="add data">

	<script type="text/javascript">
	alert("그래프");
		var randomScalingFactor = function(){ return Math.round(Math.random()*100)};
		var months = ["January","February","March","April","May","June","July", "August", "September", "October", "November", "December"];
		var lineChart = null;
		var lineChartData = {
				<% 
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://niegel0128.cpxspsymefko.us-west-2.rds.amazonaws.com:3306/ms?characterEncoding=UTF-8","niegel0128","niegel0128");  
					stmt = conn.createStatement();
					rs = stmt.executeQuery("select seq,label,fillColor,strokeColor,pointColor,pointStrokeColor,pointHighlightFill,pointHighlightStroke,data1,data2,data3,data4,data5 from graph");
					
					/* String sample = "";
					while (rs.next()) {
						//sample = rs.getString("label");
						System.out.println(rs.getString(2));
					}
					System.out.println("샘플 : "+sample);
					
				} catch (Exception e) {
					System.out.println("테스트 에러발생");
					e.printStackTrace();
				}  */
				%>
				
			labels :  ["January","February","March","April","May","June","July"],
			
			datasets : [
				{
					<%
					while(rs.next())
				    {%>
				    
					label: "<%= rs.getString(2)%>",
					fillColor : "<%= rs.getString(3)%>",
					strokeColor : "<%= rs.getString(4)%>",
					pointColor : "<%= rs.getString(5)%>",
					pointStrokeColor : "<%= rs.getString(6) %>",
					pointHighlightFill : "<%= rs.getString(7) %>",
					pointHighlightStroke : "<%= rs.getString(8) %>",
					data :[ "<%= rs.getString(9) %>", "<%= rs.getString(10) %>", "<%= rs.getString(11) %>","<%=rs.getString(12) %>","<%= rs.getString(13) %>"]
						
					<%
					System.out.println(rs.getString(2)+"2");
					System.out.println(rs.getString(3)+"3");
					System.out.println(rs.getString(4)+"4");
					System.out.println(rs.getString(5)+"5");
					System.out.println(rs.getString(6)+"6");
					System.out.println(rs.getString(7)+"7");
					System.out.println(rs.getString(8)+"8");
					System.out.println(rs.getString(9)+"9");
					System.out.println(rs.getString(10)+"10");
					System.out.println(rs.getString(11)+"11");
					System.out.println(rs.getString(12)+"12");
					System.out.println(rs.getString(13)+"13");
				    }
					
					}catch (Exception e) {
					System.out.println("테스트 에러발생");
					e.printStackTrace();
				}%> 
					 
			]
				
		 } 
				
		};

		$(function() {
			var ctx = document.getElementById("canvas").getContext("2d");
			lineChart = new Chart(ctx).Line(lineChartData, {
				///Boolean - Whether grid lines are shown across the chart
				scaleShowGridLines : true,
				//String - Colour of the grid lines
				scaleGridLineColor : "rgba(0,0,0,0.05)",
				//Number - Width of the grid lines
				scaleGridLineWidth : 1,
				//Boolean - Whether the line is curved between points
				bezierCurve : true,
				//Number - Tension of the bezier curve between points
				bezierCurveTension : 0.4,
				//Boolean - Whether to show a dot for each point
				pointDot : true,
				//Number - Radius of each point dot in pixels
				pointDotRadius : 4,
				//Number - Pixel width of point dot stroke
				pointDotStrokeWidth : 1,
				//Number - amount extra to add to the radius to cater for hit detection outside the drawn point
				pointHitDetectionRadius : 20,
				//Boolean - Whether to show a stroke for datasets
				datasetStroke : true,
				//Number - Pixel width of dataset stroke
				datasetStrokeWidth : 2,
				//Boolean - Whether to fill the dataset with a colour
				datasetFill : true,
				onAnimationProgress: function() {
					console.log("onAnimationProgress");
				},
				onAnimationComplete: function() {
					console.log("onAnimationComplete");
				}
			});
		});

		$("input#btnAdd").on("click", function() {
			lineChart.addData(
				[randomScalingFactor(),randomScalingFactor()], 
				months[(lineChart.datasets[0].points.length)%12]
			);
		});

		$("canvas").on("click", function(e) {
			var activePoints = lineChart.getPointsAtEvent(e);
			console.log(activePoints);

			for(var i in activePoints) {
				console.log(activePoints[i].value);
			}
		});

	</script>
</body>
</html>