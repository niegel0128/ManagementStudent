package com.csy.web.student;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentController.class);
	@Autowired StudentService service;
	@Autowired StudentBean student; 
	
	@RequestMapping("/list")
	public void list(){
		List<StudentBean> list = new ArrayList<StudentBean>();
		list = service.list();
		LOGGER.info("컨트롤러 학생수 :{}",list.size());
		
	}
	
	@RequestMapping("/login")
	public String login(){
		LOGGER.info("StudentBean : GET");
		return "global/login.stu";
	}	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("id")String id,@RequestParam("password")String password,
			HttpSession session,Model model){
		LOGGER.info("로그인 컨트롤러 파라미터 ID : {}",id);
		LOGGER.info("로그인 컨트롤러 파라미터 PW : {}",password);
		StudentBean stu = new StudentBean();
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
	
	/*@RequestMapping(value ="/signup",method=RequestMethod.POST )
	public StudentBean signup(@RequestParam("id")String id,
						@RequestParam("password")String password,
						@RequestParam("name")String name,
						@RequestParam("tel")String tel,
						@RequestParam("email")String email,
						@RequestParam("profileImg")String profileImg,
						HttpSession session,
						Model model){
		LOGGER.info("signup : POST");
		StudentBean stu = new StudentBean();
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
		student = service.add(stu);
		String view = "";
		
		return stu;
	}*/
	/*
	@RequestMapping(value ="/signup",method=RequestMethod.POST )
	public @ResponseBody StudentBean signup(@RequestBody StudentBean stu){
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
	}*/
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public @ResponseBody StudentBean signup(@RequestBody StudentBean stu){
		student.setId(stu.getId());
		student.setPassword(stu.getPassword());
		student.setName(stu.getName());
		student.setTel(stu.getTel());
		student.setEmail(stu.getEmail());
		student.setProfileImg(stu.getProfileImg());
		LOGGER.info("signup : POST");
		LOGGER.info("회원가입 컨트롤러 파라미터 ID : {}",stu.getId());
		LOGGER.info("회원가입 컨트롤러 파라미터 PW : {}",stu.getPassword());
		LOGGER.info("회원가입 컨트롤러 파라미터 name : {}",stu.getName());
		LOGGER.info("회원가입 컨트롤러 파라미터 tel : {}",stu.getTel());
		LOGGER.info("회원가입 컨트롤러 파라미터 email : {}",stu.getEmail());
		LOGGER.info("회원가입 컨트롤러 파라미터 profileImg : {}",stu.getProfileImg());
		service.add(student);
		return student;
	}	
	
}
