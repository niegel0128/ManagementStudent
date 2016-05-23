/*package com.csy.web.graph;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csy.web.global.GlobalController;
import com.google.gson.Gson;

@Controller
@RequestMapping(value = "/graph")
public class CopyOfGraphController {
	private static final Logger logger = LoggerFactory.getLogger(GlobalController.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Model test(Model model){
		
		logger.info("그래프 진입");
		
		GraphDTO obj = new GraphDTO();
		obj.setId("kkk");
		obj.setName("김김김");
		obj.setAttendDay("30");
		Gson gson = new Gson();
		String json = gson.toJson(obj); 
		
		logger.info(json);
		
		model.addAttribute(json);
		
		return model;
	}
}
*/