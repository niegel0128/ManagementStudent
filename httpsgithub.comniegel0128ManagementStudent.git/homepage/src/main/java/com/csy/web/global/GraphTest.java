package com.csy.web.global;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GraphTest {
	public static void main(String[] args) {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://niegel0128.cpxspsymefko.us-west-2.rds.amazonaws.com:3306/ms?characterEncoding=UTF-8","niegel0128","niegel0128");  
				stmt = conn.createStatement();
				rs = stmt.executeQuery("select seq,label,fillColor,strokeColor,pointColor,pointStrokeColor,pointHighlightFill,pointHighlightStroke,data1,data2,data3,data4,data5 from graph");
				String sample = "";
				while (rs.next()) {
					sample = rs.getString(2);
					//sample = rs.getString("label");
				}
				System.out.println("샘플 : "+sample);
				
			} catch (Exception e) {
				System.out.println("테스트 에러발생");
				e.printStackTrace();
			}
		}
	}
