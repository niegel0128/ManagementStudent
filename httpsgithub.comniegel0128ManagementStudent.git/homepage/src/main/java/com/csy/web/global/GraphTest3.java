package com.csy.web.global;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GraphTest3 {
public static void main(String[] args) {
	JSONObject ajaxObjCols1 = new JSONObject();    
	JSONObject ajaxObjCols2 = new JSONObject();    
	
	JSONArray ajaxArrayCols1 = new JSONArray();    
	JSONArray ajaxArrayCols2 = new JSONArray();    
	
	ajaxObjCols1.put("id", "");
	ajaxObjCols1.put("label", "Topping");
	ajaxObjCols1.put("pattern", "");
	ajaxObjCols1.put("type", "string");
	
	ajaxArrayCols1.add(ajaxObjCols1);
	
	ajaxObjCols2.put("id", "");
	ajaxObjCols2.put("label", "Slices");
	ajaxObjCols2.put("pattern", "");
	ajaxObjCols2.put("type", "number");
	
	ajaxArrayCols2.add(ajaxObjCols2);
	
	//System.out.println(ajaxArrayCols1);
	//System.out.println(ajaxArrayCols2);
	
	
	JSONObject ajaxObjRows1 = new JSONObject();    
	JSONObject ajaxObjRows2 = new JSONObject();   
	
	JSONObject ajaxObjRows3 = new JSONObject();   
	
	JSONArray ajaxArryRows1 = new JSONArray();        
	
	ajaxObjRows1.put("v", "Mushrooms");
	ajaxObjRows1.put("f", null);
	ajaxObjRows2.put("v", 3);
	ajaxObjRows2.put("f", null);
	
	ajaxArryRows1.add(ajaxObjRows1);
	ajaxArryRows1.add(ajaxObjRows2);
	
	//System.out.println(ajaxArryRows1);
	
	ajaxObjRows3.put("c", ajaxArryRows1);
	
	//System.out.println(ajaxObjRows3);
	
	JSONArray ajaxArryRows2 = new JSONArray(); 
	
	ajaxArryRows2.add(ajaxObjRows3);
	
	//System.out.println(ajaxArryRows2);
	
	
	JSONObject ajaxObjColsRows1 = new JSONObject();
	ajaxObjColsRows1.put("cols", ajaxArrayCols1);
	ajaxObjColsRows1.put("rows", ajaxArryRows2);
	
	System.out.println(ajaxObjColsRows1);
	
	String result = ajaxObjColsRows1.toString();  // JSONObject를 String 에 담기
	System.out.print(result);
	
	
	
	

}
}
