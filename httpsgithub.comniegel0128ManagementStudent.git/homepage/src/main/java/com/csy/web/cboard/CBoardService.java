package com.csy.web.cboard;

import java.util.List;

public interface CBoardService {
	
	public int add(CBoardDTO cBoardBean);
	//메인 데이터 출력
	public List<CBoardDTO> list();
	public List<CBoardDTO> getByName(CBoardDTO cBoardBean);
	public List<CBoardDTO> getById(CBoardDTO cBoardBean);
	public int count();
	public int change(CBoardDTO cBoardBean);
	public int remove(CBoardDTO cBoardBean);	
}
