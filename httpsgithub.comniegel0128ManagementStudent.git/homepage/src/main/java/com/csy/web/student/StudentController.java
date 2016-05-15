package com.csy.web.student;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/student")
public class StudentController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentController.class);
	@Autowired StudentService service;
	@Autowired StudentDTO student; 
	
	@RequestMapping("/list")
	public void list(){
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		list = service.list();
		LOGGER.info("컨트롤러 학생수 :{}",list.size());
		
	}
	
	@RequestMapping("/login")
	public String login(){
		LOGGER.info("StudentDTO : GET");
		return "global/login.stu";
	}	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("id")String id,@RequestParam("password")String password,
			HttpSession session,Model model){
		LOGGER.info("로그인 컨트롤러 파라미터 ID : {}",id);
		LOGGER.info("로그인 컨트롤러 파라미터 PW : {}",password);
		StudentDTO stu = new StudentDTO();
		stu.setId(id);
		stu.setPassword(password);
		student = service.login(stu);
		String view = "";
		if (student != null) {
			LOGGER.info("로그인 성공");
			/*view = "redirect:/student/content/"+id;*/
			view = "auth/student/main.stu";
		} else {
			LOGGER.info("로그인 실패");
			view = "student/login";
		}
		return view;
	}
	
	@RequestMapping("/signup")
	public String signup(){
		LOGGER.info("signup : GET");
		return "global/signup.stu";
	}	
	
	@RequestMapping(value ="/signup",method=RequestMethod.POST )
	public String signup(@RequestParam("id")String id,
						@RequestParam("password")String password,
						@RequestParam("name")String name,
						@RequestParam("tel")String tel,
						@RequestParam("email")String email,
						@RequestParam("profileImg")String profileImg,
						HttpSession session,
						Model model){
		LOGGER.info("signup : POST");
		StudentDTO stu = new StudentDTO();
		stu.setId(id);
		stu.setPassword(password);
		stu.setName(name);
		stu.setTel(tel);
		stu.setEmail(email);
		stu.setProfileImg(profileImg);
		LOGGER.info("회원가입 컨트롤러 파라미터 ID : {}",id);
		LOGGER.info("회원가입 컨트롤러 파라미터 PW : {}",password);
		LOGGER.info("회원가입 컨트롤러 파라미터 name : {}",name);
		LOGGER.info("회원가입 컨트롤러 파라미터 tel : {}",tel);
		LOGGER.info("회원가입 컨트롤러 파라미터 email : {}",email);
		LOGGER.info("회원가입 컨트롤러 파라미터 profileImg : {}",profileImg);
		int res = service.add(stu);
		String view = "";
		if (res == 1) {
			view = "global/login.stu";
		} else {
			view = "global/signup.stu";
		}
		
		return view;
	}
	
	@RequestMapping("/logout")
	public String logout(SessionStatus status){
		LOGGER.info("StudentController : logout");
		status.setComplete();
		return "redirect:/";
	}
	
	@RequestMapping("/newitem")
	public String newitem(){
		LOGGER.info("StudentController : newitem");
		return "auth/student/newitem.stu";
	}	
	
	@RequestMapping("/graph")
	public String graph(){
		LOGGER.info("StudentController : newitem");
		return "auth/student/graph.stu";
	}	
	
	@RequestMapping("/cboard")
	public String cboard(){
		LOGGER.info("StudentController : cboard");
		return "auth/student/cboard.stu";
	}	
	
	@RequestMapping("/calendar")
	public String calendar(){
		LOGGER.info("StudentController : calendar");
		return "auth/student/calendar.stu";
	}
	
	@RequestMapping("/main")
	public String main(){
		LOGGER.info("signup : GET");
		return "auth/student/main.stu";
	}
}
