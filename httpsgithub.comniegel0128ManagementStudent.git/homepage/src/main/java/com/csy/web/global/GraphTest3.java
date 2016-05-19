package com.csy.web.global;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GraphTest3 {
public static void main(String[] args) {
	JSONObject ajaxObjCols1 = new JSONObject();    
	JSONObject ajaxObjCols2 = new JSONObject();    
	JSONObject ajaxObjCols3 = new JSONObject();    
	JSONObject ajaxObjCols4 = new JSONObject();    
	
	JSONArray ajaxArrayCols1 = new JSONArray();    
	
	ajaxObjCols1.put("id", "");
	ajaxObjCols2.put("label", "Topping");
	ajaxObjCols2.put("pattern", "");
	ajaxObjCols2.put("type", "string");
	
	ajaxArrayCols1.add(ajaxObjCols1);
	ajaxArrayCols1.add(ajaxObjCols2);
	ajaxArrayCols1.add(ajaxObjCols3);
	ajaxArrayCols1.add(ajaxObjCols4);
	
	System.out.println(ajaxArrayCols1);
	
	
	JSONObject data = new JSONObject();
	JSONObject ajaxObjRows1 = new JSONObject();    
	JSONObject ajaxObjRows2 = new JSONObject();   
	JSONArray ajaxArrayRows4 = new JSONArray();   
	JSONObject ajaxObjRows5 = new JSONObject();   
	
	
	
	JSONObject ajaxObjRows3 = new JSONObject();    
	
	JSONArray ajaxArryRows1 = new JSONArray();        
	
	ajaxObjRows1.put("v", "2014-08-27 16:13:17");
	ajaxObjRows2.put("v", "294");
	
	
	String ajaxObjRows1result = ajaxObjRows2.toString();
	String ajaxObjRows2result = ajaxObjRows2.toString();

	ajaxArryRows1.add(ajaxObjRows1);
	ajaxArryRows1.add(ajaxObjRows2);
	
	//System.out.println(ajaxArryRows1);
	
	ajaxObjRows3.put("c", ajaxArryRows1);
	
	//System.out.println(ajaxObjRows3);
	
	JSONArray ajaxArryRows2 = new JSONArray(); 
	
	ajaxArryRows2.add(ajaxObjRows3);
	
	System.out.println(ajaxArryRows2);
	
	
	JSONObject ajaxObjColsRows1 = new JSONObject();
	ajaxObjColsRows1.put("cols", ajaxArrayCols1);
	ajaxObjColsRows1.put("rows", ajaxArryRows2);
	
	System.out.println(ajaxObjColsRows1);
	
	String result = ajaxObjColsRows1.toString();  // JSONObject를 String 에 담기
	System.out.print(result);
	
	
	
	

}
}
