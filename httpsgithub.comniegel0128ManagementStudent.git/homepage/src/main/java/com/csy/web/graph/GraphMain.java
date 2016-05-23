package com.csy.web.graph;

import com.google.gson.Gson;

public class GraphMain {
	public static void main(String[] args) {
		GraphDTO obj = new GraphDTO();
		obj.setId("kkk");
		obj.setName("김김김");
		obj.setAttendDay("30");
		Gson gson = new Gson();
		String json = gson.toJson(obj); 
		
		System.out.println(json);
	}
}
