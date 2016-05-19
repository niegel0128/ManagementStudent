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
					async : false,
					error : function(request,status,error) {
						alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
					}
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
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">16일 수업</td>\
					      <td style="vertical-align: middle;">12:00 신촌 카페</td>\
		                </tr>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">18일 수업</td>\
					      <td style="vertical-align: middle;">13:00 신촌 카페</td>\
		                </tr>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>\
					      <td style="text-align: center; vertical-align: middle;">23일 수업</td>\
					      <td style="vertical-align: middle;">15:00 신촌 카페</td>\
		                </tr>\
		                <tr>\
		                  <td style="text-align: center; vertical-align: middle;"><strong><p><font size="5">15</font></p></strong> <p>May</p></td>\
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
		      </form>\
		    </div>';
			
			$('#content').html(mainpage);
			student.calendar();
			student.cboard();
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
			
		}
		
		/*graph: function(context) {
			return '<div class="col-lg-6">\
	          <h2><i clfass="glyphicon glyphicon-stats"></i> 출석 그래프</h2>\
	          <canvas id="myChart" class="col-lg-6"></canvas>\
	          <p><a class="btn btn-primary" id="graphBtn" role="button">View details »</a></p>\
	        </div>';
		},
		newitem: function(context) {
			return '';
		}*/
	}