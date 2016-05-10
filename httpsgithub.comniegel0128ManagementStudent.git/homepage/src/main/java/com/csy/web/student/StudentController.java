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
		return "student/main.stu";
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
			view = "student/main.stu";
		} else {
			LOGGER.info("로그인 실패");
			view = "student/login";
		}
		return view;
	}
}
