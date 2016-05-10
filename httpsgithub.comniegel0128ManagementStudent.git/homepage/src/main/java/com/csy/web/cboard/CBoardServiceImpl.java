package com.csy.web.cboard;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csy.web.admin.AdminBean;
import com.csy.web.mapper.CBoardMapper;
@Service
public class CBoardServiceImpl implements CBoardService{
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CBoardServiceImpl.class);
	@Autowired SqlSession SqlSession;
	@Autowired CBoardBean CBoardBean;
	
	@Override
	public int add(CBoardBean cBoardBean) {
		LOGGER.info("cBoardServiceImpl : add");
		return 0;
	}

	@Override
	public List<CBoardBean> list() {
		LOGGER.info("cBoardServiceImpl : list");
		List<CBoardBean> list = new ArrayList<CBoardBean>();
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		list = mapper.selectAll();
		LOGGER.info("게시판 글 수  : {}",list.size());
		return list;
	}

	@Override
	public List<CBoardBean> getByName(CBoardBean cBoardBean) {
		LOGGER.info("cBoardServiceImpl : getByName");
		return null;
	}

	@Override
	public AdminBean getById(CBoardBean cBoardBean) {
		LOGGER.info("cBoardServiceImpl : getByName");
		return null;
	}

	@Override
	public int count() {
		LOGGER.info("cBoardServiceImpl : count");
		return 0;
	}

	@Override
	public int change(CBoardBean cBoardBean) {
		LOGGER.info("cBoardServiceImpl : change");
		return 0;
	}

	@Override
	public int remove(CBoardBean cBoardBean) {
		LOGGER.info("cBoardServiceImpl : remove");
		return 0;
	}

}
