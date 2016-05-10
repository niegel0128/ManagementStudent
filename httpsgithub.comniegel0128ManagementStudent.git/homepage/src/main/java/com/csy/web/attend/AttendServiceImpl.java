package com.csy.web.attend;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csy.web.mapper.AttendMapper;
@Service
public class AttendServiceImpl implements AttendService{
	
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(AttendServiceImpl.class);
	@Autowired SqlSession SqlSession;
	@Autowired AttendBean AttendBean;
	
	
	@Override
	public int add(AttendBean AttendBean) {
		LOGGER.info("AttendServiceImpl: add");
		return 0;
	}

	@Override
	public List<AttendBean> list() {
		LOGGER.info("AttendServiceImpl: list");
		List<AttendBean> list = new ArrayList<AttendBean>();
		AttendMapper mapper = SqlSession.getMapper(AttendMapper.class);
		list = mapper.selectAll();
		return list;
	}

	@Override
	public List<AttendBean> getByName(AttendBean AttendBean) {
		LOGGER.info("AttendServiceImpl: getByName");
		return null;
	}

	@Override
	public AttendBean getById(AttendBean AttendBean) {
		LOGGER.info("AttendServiceImpl: getById");
		return null;
	}

	@Override
	public int count() {
		LOGGER.info("AttendServiceImpl: count");
		return 0;
	}

	@Override
	public int change(AttendBean AttendBean) {
		LOGGER.info("AttendServiceImpl: count");
		return 0;
	}

	@Override
	public int remove(AttendBean AttendBean) {
		LOGGER.info("AttendServiceImpl: remove");
		return 0;
	}
	
}
