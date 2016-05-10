package com.csy.web.admin;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csy.web.mapper.AdminMapper;
@Service
public class AdminServiceImpl implements AdminService{
	
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(AdminServiceImpl.class);
	@Autowired SqlSession SqlSession;
	@Autowired AdminBean AdminBean;
	
	@Override
	public int add(AdminBean bean) {
		LOGGER.info("AdminServiceImpl:add");
		return 0;
	}

	@Override
	public List<AdminBean> list() {
		LOGGER.info("AdminServiceImpl:list");
		List<AdminBean> list = new ArrayList<AdminBean>();
		AdminMapper mapper = SqlSession.getMapper(AdminMapper.class);
		list = mapper.selectAll();
		LOGGER.info("Admin 리스트 : {}",list.size());
		return list;
	}

	@Override
	public List<AdminBean> getByName(AdminBean bean) {
		LOGGER.info("AdminServiceImpl:getByName");
		return null;
	}

	@Override
	public AdminBean getById(AdminBean bean) {
		LOGGER.info("AdminServiceImpl:getById");
		return null;
	}

	@Override
	public int count() {
		LOGGER.info("AdminServiceImpl:count");
		return 0;
	}

	@Override
	public int change(AdminBean bean) {
		LOGGER.info("AdminServiceImpl:change");
		return 0;
	}

	@Override
	public int remove(AdminBean bean) {
		LOGGER.info("AdminServiceImpl:remove");
		return 0;
	}

}
