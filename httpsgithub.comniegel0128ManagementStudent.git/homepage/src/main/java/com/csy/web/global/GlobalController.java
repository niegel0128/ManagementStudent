package com.csy.web.global;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GlobalController {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalController.class);
	/*private static final Logger logger = LoggerFactory
			.getLogger(GlobalController.class);*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Locale loacl,Model model){
		System.out.println("홈");
		/*logger.info("홈 컨트롤러 :");*/
		logger.info("홈컨트롤러");
		logger.debug("홈컨트롤러");
		return "global/login.stu";
	}
}
