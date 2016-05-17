package com.csy.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.csy.web.cboard.CBoardDTO;
@Repository
public interface CBoardMapper {
	public int insert(CBoardDTO cBoardBean);
	
	public List<CBoardDTO> selectAll();
	
	public List<CBoardDTO> selectByName(CBoardDTO cBoardBean);
	public List<CBoardDTO> selectById(CBoardDTO cBoardBean);
	public int count();
	public int update(CBoardDTO cBoardBean);
	public int delete(CBoardDTO cBoardBean);	
}
