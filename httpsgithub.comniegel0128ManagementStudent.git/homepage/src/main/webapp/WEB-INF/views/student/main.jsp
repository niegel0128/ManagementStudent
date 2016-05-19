<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
<div class="container">
<form>
      <!-- Jumbotron -->
      <div class="jumbotron" style ="background-image: url(${img}/main.png);margin-top:60px " >
        <h2 style="color:white;">학생관리 페이지에 오신것을 환영합니다!</h2>
        <p class="lead" style="color:white;">이 페이지는 수강자료 게시판,출석 그래프,일정표,상세일정을 포함하고있습니다.</p>
      </div>
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-lg-6">
          <h2><i class="glyphicon glyphicon-calendar"></i>일정표</h2>
          <div id='calendar'></div>
          <p><a class="btn btn-primary" id="calendarBtn" role="button">View details »</a></p>
        </div>
        
        <div class="col-lg-6">
          <h2 class="sub-header"><i class="glyphicon glyphicon-list-alt"></i>상세 일정</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th colspan="3">상세일정</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>
			      <td style="text-align: center; vertical-align: middle;">15일 수업</td>
			      <td style="vertical-align: middle;">9:00 신촌 카페</td>
                </tr>
                <tr>
                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>
			      <td style="text-align: center; vertical-align: middle;">15일 수업</td>
			      <td style="vertical-align: middle;">9:00 신촌 카페</td>
                </tr>
                <tr>
                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>
			      <td style="text-align: center; vertical-align: middle;">15일 수업</td>
			      <td style="vertical-align: middle;">9:00 신촌 카페</td>
                </tr>
                <tr>
                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>
			      <td style="text-align: center; vertical-align: middle;">15일 수업</td>
			      <td style="vertical-align: middle;">9:00 신촌 카페</td>
                </tr>
                <tr>
                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>
			      <td style="text-align: center; vertical-align: middle;">15일 수업</td>
			      <td style="vertical-align: middle;">9:00 신촌 카페</td>
                </tr>
              </tbody>
            </table>
          </div>
          <p><a class="btn btn-primary" id = "newitemBtn" role="button">View details »</a></p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
          <h2><i class="glyphicon glyphicon-stats"></i> 출석 그래프</h2>
          <canvas id="myChart" class="col-lg-6"></canvas>
          <p><a class="btn btn-primary" id="graphBtn" role="button">View details »</a></p>
        </div>
        <div class="col-lg-6">
          <h2 class="sub-header"><i class="glyphicon glyphicon-list"></i>수강 자료 게시판</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>제목</th>
                  <th colspan="2">내용</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1,001</td>
                  <td>Lorem</td>
                  <td>ipsum</td>
                </tr>
                <tr>
                  <td>1,002</td>
                  <td>amet</td>
                  <td>consectetur</td>
                </tr>
                <tr>
                  <td>1,003</td>
                  <td>Integer</td>
                  <td>nec</td>
                </tr>
                <tr>
                  <td>1,003</td>
                  <td>libero</td>
                  <td>Sed</td>
                </tr>
                <tr>
                  <td>1,004</td>
                  <td>dapibus</td>
                  <td>diam</td>
                </tr>
              </tbody>
            </table>
          </div>
          <p><a class="btn btn-primary" id="boardBtn" role="button">View details »</a></p>
        </div>
      </div>
      </form>
    </div>
    <canvas id="__gesture_canvas__" width="0" height="0" style="z-index: 100000000; position: fixed; top: 0px; left: 0px; background: transparent !important;"></canvas>
<script type="text/javascript" src="${js}/calendar.js"></script>
<script type="text/javascript" src="${js}/myChart.js"></script>
<script>
	$(function() {
		$('#newitemBtn').click(function() {
			alert('상세일정 버튼클릭!');
			$('form').attr('action','${context}/student/newitem')
			.attr('method','get').submit();
			});
		$('#graphBtn').click(function() {
			alert('출석그래프 버튼클릭!');
			$('form').attr('action','${context}/student/graph')
			.attr('method','get').submit();
			});
		$('#boardBtn').click(function() {
			alert('수강자료 게시판 버튼클릭!');
			$('form').attr('action','${context}/student/cboard')
			.attr('method','get').submit();
			});
		$('#calendarBtn').click(function() {
			alert('일정표 버튼클릭!');
			$('form').attr('action','${context}/student/calendar')
			.attr('method','get').submit();
			});
	});
</script>