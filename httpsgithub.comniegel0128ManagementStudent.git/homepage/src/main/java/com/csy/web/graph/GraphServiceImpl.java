package com.csy.web.graph;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csy.web.mapper.GraphMapper;
@Service
public class GraphServiceImpl implements GraphService{
	private static final Logger logger = LoggerFactory
			.getLogger(GraphServiceImpl.class);
	
	@Autowired SqlSession SqlSession;
	@Autowired GraphDTO graph; 
	
	@Override
	public List<GraphDTO> list() {
		logger.info("GraphServiceImpl : list");
		List<GraphDTO> list = new ArrayList<GraphDTO>();
		GraphMapper mapper = SqlSession.getMapper(GraphMapper.class);
		list = mapper.selectAll();
		logger.info("게시판 글 수  : {}",list.size());
		return list;
	}
}
