package com.csy.web.cboard;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is ;
import static org.hamcrest.CoreMatchers.not ;

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
	@Autowired CBoardDTO cboard;
	
	@Override
	public int add(CBoardDTO CBoardDTO) {
		LOGGER.info("cBoardServiceImpl : add");
		return 0;
	}

	@Override
	public List<CBoardDTO> list() {
		LOGGER.info("cBoardServiceImpl : list");
		List<CBoardDTO> list = new ArrayList<CBoardDTO>();
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		list = mapper.selectAll();
		LOGGER.info("게시판 글 수  : {}",list.size());
		return list;
	}

	@Override
	public List<CBoardDTO> getByName(CBoardDTO CBoardDTO) {
		LOGGER.info("cBoardServiceImpl : getByName");
		/*CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		List<CBoardDTO> list = new ArrayList<CBoardDTO>();
		cboard.setRegUserId("cho");
		list = mapper.selectById(cboard);
		assertThat(list.size(),is(not(0)));*/
		return null;
	}

	@Override
	public List<CBoardDTO> getById(CBoardDTO CBoardDTO) {
		LOGGER.info("cBoardServiceImpl : getByName");
		return null;
	}

	@Override
	public int count() {
		LOGGER.info("cBoardServiceImpl : count");
		return 0;
	}

	@Override
	public int change(CBoardDTO CBoardDTO) {
		LOGGER.info("cBoardServiceImpl : change");
		return 0;
	}

	@Override
	public int remove(CBoardDTO CBoardDTO) {
		LOGGER.info("cBoardServiceImpl : remove");
		return 0;
	}

}
