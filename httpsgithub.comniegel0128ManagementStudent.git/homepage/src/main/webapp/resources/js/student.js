/**
 * student.js
 */

	var student = {
		context : '',
		init : function(context) {
			this.context =context;
			this.login();
			this.join();
		},
		/*
		* student.context -> context
		*/	
			
		login : function() {
			$('#loginButton').click(function() {
				alert('로그인 버튼클릭!');
				var stu = {
					'id' : $('#id').val(),
					'password' : $('#password').val()
				}
				$.ajax({
					url : student.context+'/student/login',
					data : JSON.stringify(stu),
					datatype : 'json',
					type : 'post',
					contentType: "application/json",
					mimeType : "application/json",
					async : true
				})
				.fail(function(request,status,error) {
					alert("아이디와 비밀번호를 확인하세요");
					//alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
				})
				.done( function(data) {
					if (data != null) {
						alert(data.id + '님 회원으로 로그인되었습니다');
						student.main();
					} else {
						alert('로그인 중 오류가 발생했습니다.');
						return false;
					}
				});
			});
			
		},
		/*회원가입*/
		join : function() {
			$('#signupButton').click(function() {
				alert('회원가입 버튼클릭!');
				$('#content').html(student.signup());
				$('#reset').click(function(){
					alert('리셋!');
				});
				$('#signup').click(function(){
					alert('확인 버튼 클릭!')
					var sign = {
							id : $('#id').val(),	
							password : $('#password').val(),	
							name : $('#name').val(),
							tel : $('#tel').val(),
							email : $('#email').val(),	
							profileImg : $('#profileImg').val()
						};
						alert('멤버 데이터 JSON 처리됨'+student.context);
						alert(sign.id+"id");
						alert(sign.password+"password");
						alert(sign.name+"name");
						alert(sign.tel+"tel");
						alert(sign.email+"email");
						alert(sign.profileImg+"profileImg");
						$.ajax({
							url : student.context+'/student/signup',
							data : JSON.stringify(sign),
							dataType : 'json',
							type : 'post',
							contentType: "application/json",
							mimeType : "application/json",
							async : false,
							success : function(data) {
								alert('성공');
								if (data != null) {
									alert(data.name+'님 회원으로 등록되었습니다');
								} else {
									alert('회원가입 중 오류가 발생했습니다');
									return false;
								}
							},
							error : function(request,status,error) {
								alert("에러!");
								alert("code:"+request.status+"\n");
								alert("message:"+request.responseText+"\n");
								alert("error:"+error);
							}
						});
				}); 
			});
		},
		/*메인페이지*/
		main : function() {
			var mainpage ='<nav class="navbar navbar-inverse navbar-fixed-top">\
		      <div class="container-fluid">\
		        <div class="navbar-header">\
		          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">\
		            <span class="sr-only">Toggle navigation</span>\
		            <span class="icon-bar"></span>\
		            <span class="icon-bar"></span>\
		            <span class="icon-bar"></span>\
		          </button>\
		          <a class="navbar-brand" href="${context}/student/main">학생관리 페이지</a>\
		        </div>\
		        <div id="navbar" class="navbar-collapse collapse">\
		          <ul class="nav navbar-nav navbar-right">\
		            <li><a href="'+student.context+'/student/logout">로그아웃</a></li>\
		          </ul>\
		        </div>\
		      </div>\
		    </nav>\
				<div class="container">\
				<form>\
		      <!-- Jumbotron -->\
		      <div class="jumbotron" style ="background-image: url('+student.context+'/resources/img/main.png);margin-top:60px " >\
		        <h2 style="color:white;">학생관리 페이지에 오신것을 환영합니다!</h2>\
		        <p class="lead" style="color:white;">이 페이지는 수강자료 게시판,출석 그래프,일정표,상세일정을 포함하고있습니다.</p>\
		      </div>\
		      <!-- Example row of columns -->\
		      <div class="row">\
		        <div class="col-lg-6">\
		          <h2><i class="glyphicon glyphicon-calendar"></i>일정표</h2>\
		          <div id="calendar"></div>\
		        </div>\
		        <div class="col-lg-6">\
		          <h2 class="sub-header"><i class="glyphicon glyphicon-list-alt"></i>상세 일정</h2>\
		          <div class="table-responsive">\
		            <table class="table table-striped">\
		              <thead>\
		                <tr>\
		                  <th colspan="3">상세일정</th>\
		                </tr>\
		              </thead>\
		              <tbody>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">15일 수업</td>\
					      <td style="vertical-align: middle;">9:00 신촌 카페</td>\
		                </tr>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">16</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">16일 수업</td>\
					      <td style="vertical-align: middle;">12:00 신촌 카페</td>\
		                </tr>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">18</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">18일 수업</td>\
					      <td style="vertical-align: middle;">13:00 신촌 카페</td>\
		                </tr>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">23</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">23일 수업</td>\
					      <td style="vertical-align: middle;">15:00 신촌 카페</td>\
		                </tr>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">26</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">26일 수업</td>\
					      <td style="vertical-align: middle;">19:00 신촌 카페</td>\
		                </tr>\
		              </tbody>\
		            </table>\
		          </div>\
		        </div>\
		    </div>\
		    <div class="row">\
		        <div class="col-lg-6">\
		          <h2><i class="glyphicon glyphicon-stats"></i> 출석 그래프</h2>\
		          <canvas id="myChart" class="col-lg-6"></canvas>\
		        </div>\
		        <div class="col-lg-6" id="cboard">\
		        </div>\
		      </div>\
		      <div class="row" align="center">\
		      	<h2><i class="glyphicon glyphicon-road"></i> 지도 </h2>\
		  		<div id="map_view" align="center" style="width:500px; height:300px;"></div>\
		  	  </div>\
		      </form>\
		    </div>';
			
			$('#content').html(mainpage);
			student.calendar();
			student.cboard();
			student.googleMap();
		},
		signup : function(){
			return '<div class="container">\
			   <form class="form-signin">\
			     <h2 class="form-signin-heading">회원가입</h2>\
			     <label for="id" class="sr-only">Id</label>\
			     <input type="text" id="id" name="id" class="form-control" placeholder="Id" required autofocus="">\
			     <label for="password" class="sr-only">Password</label>\
			     <input type="password" id="password" name="password" class="form-control" required placeholder="Password">\
			     <label for="repassword" class="sr-only">rePassword</label>\
			     <input type="password" id="repassword" name="repassword" class="form-control" required placeholder="repassword">\
			     <label for="name" class="sr-only">name</label>\
			     <input type="text" id="name" name="name" class="form-control" placeholder="name" required autofocus="">\
			     <label for="tel" class="sr-only">tel</label>\
			     <input type="text" id="tel" name="tel" class="form-control" placeholder="tel">\
			     <label for="email" class="sr-only">email</label>\
			     <input type="text" id="email" name="email" class="form-control" placeholder="email">\
			     <label for="profileImg" class="sr-only">profileImg</label>\
			     <input type="text" id="profileImg" name="profileImg" class="form-control" placeholder="profileImg">\
			     <button class="btn btn-lg btn-primary btn-block" id="signup" type="submit">확인</button>\
			     <button class="btn btn-lg btn-primary btn-block" id="reset" type="reset">취소</button>\
			   </form>\
			 </div>';
		},
		calendar: function() {
			var cal =  // document ready
				  $('#calendar').fullCalendar({
					    header: {
					      left: 'prev,next today',
					      center: 'title',
					      right: 'month,agendaWeek,agendaDay'
					    },
					    defaultDate: '2016-05-19',
					    editable: true,
					    eventLimit: true, // allow "more" link when too many events
					    events: [
					      {
					        title: 'All Day Event',
					        start: '2016-05-01'
					      },
					      {
					        title: 'Long Event',
					        start: '2016-05-07',
					        end: '2016-05-10'
					      },
					      {
					        id: 999,
					        title: 'Repeating Event',
					        start: '2016-05-09T16:00:00'
					      },
					      {
					        id: 999,
					        title: 'Repeating Event',
					        start: '2016-05-16T16:00:00'
					      },
					      {
					        title: 'Conference',
					        start: '2016-05-11',
					        end: '2016-05-13'
					      },
					      {
					        title: 'Meeting',
					        start: '2016-05-12T10:30:00',
					        end: '2016-05-12T12:30:00'
					      },
					      {
					        title: 'Lunch',
					        start: '2016-05-12T12:00:00'
					      },
					      {
					        title: 'Meeting',
					        start: '2016-05-12T14:30:00'
					      },
					      {
					        title: 'Happy Hour',
					        start: '2016-05-12T17:30:00'
					      },
					      {
					        title: 'Dinner',
					        start: '2016-05-12T20:00:00'
					      },
					      {
					        title: 'Birthday Party',
					        start: '2016-05-13T07:00:00'
					      },
					      {
					        title: 'Click for Google',
					        url: 'http://google.com/',
					        start: '2016-05-28'
					      }
					    ]
					  })
			return cal;
		},
		cboard: function() {
			alert('cboard진입');
			$.getJSON(student.context+'/cboard/list',function(data){
			var cboardlist =
			'<h2 class="sub-header"><i class="glyphicon glyphicon-list"></i>수강 자료 게시판</h2>\
		          <div class="table-responsive">\
		            <table class="table table-striped">\
		              <thead>\
		                <tr>\
		                  <th>제목</th>\
		                  <th>내용</th>\
						  <th>첨부파일</th>\
		                </tr>\
		              </thead>\
		              <tbody>';
						$.each(data, function(index,cboard) {
							cboardlist+=
		                '<tr>\
		                  <td>'+cboard.title+'</td>\
		                  <td>'+cboard.des+'</td>\
		                  <td>'+cboard.fileSrc1+'</td>\
		                </tr>';
						});
						cboardlist+= '</tbody>\
		            </table>\
		          </div>\
		        </div>';
			$('#cboard').html(cboardlist);
			});
			
		},
		
		googleMap : function() {
			alert("구글 맵 출력~");
				/*
					http://openapi.map.naver.com/api/geocode.php?key=f32441ebcd3cc9de474f8081df1e54e3&encoding=euc-kr&coord=LatLng&query=서울특별시 강남구 강남대로 456
	                위의 링크에서 뒤에 주소를 적으면 x,y 값을 구할수 있습니다.
				*/
				var Y_point			= 35.87110100714382;		// Y 좌표
				var X_point			= 128.60169690333006;		// X 좌표

				var zoomLevel		= 16;						// 지도의 확대 레벨 : 숫자가 클수록 확대정도가 큼

				var markerTitle		= "일인개발";				// 현재 위치 마커에 마우스를 오버을때 나타나는 정보
				var markerMaxWidth	= 300;						// 마커를 클릭했을때 나타나는 말풍선의 최대 크기

				// 말풍선 내용
				var contentString	= '<div>' +
				'<h2>일인개발</h2>'+
				'<p>원페이지 형태로 api구현의 집합소<br />' +
				'<a href="#" target="_blank">링크테스트</a>'+ //링크도 넣을 수 있음
				'</div>';
				var myLatlng = new google.maps.LatLng(Y_point, X_point);
				var mapOptions = {
									zoom: zoomLevel,
									center: myLatlng,
									mapTypeId: google.maps.MapTypeId.ROADMAP
				}
				var map = new google.maps.Map(document.getElementById('map_view'), mapOptions);

				var marker = new google.maps.Marker({
														position: myLatlng,
														map: map,
														title: markerTitle
				});

				var infowindow = new google.maps.InfoWindow(
															{
																content: contentString,
																maxWidth: markerMaxWidth
															}
				);

				google.maps.event.addListener(marker, 'click', function() {
					infowindow.open(map, marker);
				});
			}
	}