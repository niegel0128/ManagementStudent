package com.csy.web.student;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping("/loginfrom")
	public String login(){
		LOGGER.info("StudentDTO : GET");
		return "global/login.stu";
	}	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody StudentDTO login(@RequestBody StudentDTO stu){
		LOGGER.info("===login===");
		LOGGER.info("로그인 컨트롤러 파라미터 ID : {}",stu.getId());
		LOGGER.info("로그인 컨트롤러 파라미터 PW : {}",stu.getPassword());
		

		student = service.login(stu);
		if (student.getId().equals(stu.getId())) {
			LOGGER.info("===로그인 컨트롤에서 성공함===");
		} else {
			LOGGER.info("===로그인 컨트롤에서 실패함===");
		}
		return student;
	}
	
	@RequestMapping("/signup")
	public String signup(){
		LOGGER.info("signup : GET");
		return "global/signup.stu";
	}	
	
	@RequestMapping(value ="/signup",method=RequestMethod.POST )
	public @ResponseBody StudentDTO signup(@RequestBody StudentDTO stu){
		LOGGER.info("signup : POST");
		student.setId(stu.getId());
		student.setPassword(stu.getPassword());
		student.setName(stu.getName());
		student.setTel(stu.getTel());
		student.setEmail(stu.getEmail());
		student.setProfileImg(stu.getProfileImg());
		LOGGER.info("회원가입 컨트롤러 파라미터 ID : {}",stu.getId());
		LOGGER.info("회원가입 컨트롤러 파라미터 PW : {}",stu.getPassword());
		LOGGER.info("회원가입 컨트롤러 파라미터 name : {}",stu.getName());
		LOGGER.info("회원가입 컨트롤러 파라미터 tel : {}",stu.getTel());
		LOGGER.info("회원가입 컨트롤러 파라미터 email : {}",stu.getEmail());
		LOGGER.info("회원가입 컨트롤러 파라미터 profileImg : {}",stu.getProfileImg());
		service.add(student);
		return student;
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
	
	//@RequestMapping(value= "/main", method={RequestMethod.POST,RequestMethod.GET})
	@RequestMapping("/main")
	public String main(){
		LOGGER.info("signup : GET");
		return "auth/student/main.stu";
	}
}
