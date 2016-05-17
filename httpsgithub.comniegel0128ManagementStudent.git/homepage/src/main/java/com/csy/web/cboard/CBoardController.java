package com.csy.web.cboard;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cboard")
public class CBoardController {
	private static final Logger logger = LoggerFactory
			.getLogger(CBoardController.class);
	@Autowired CBoardService service;
	@Autowired CBoardDTO cboard;
	
	@RequestMapping("/list")
	public @ResponseBody List<CBoardDTO> list(){
		logger.info("cboard list진입");
		List<CBoardDTO> list = new ArrayList<CBoardDTO>();
		list = service.list();
		logger.info("출력된 cboard리스트수 : {}",list.size());
		return list;
	}
}
