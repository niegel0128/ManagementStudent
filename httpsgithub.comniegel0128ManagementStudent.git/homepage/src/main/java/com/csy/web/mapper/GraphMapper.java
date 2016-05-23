package com.csy.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.csy.web.graph.GraphDTO;
@Repository
public interface GraphMapper {
	public List<GraphDTO> selectAll();
}
