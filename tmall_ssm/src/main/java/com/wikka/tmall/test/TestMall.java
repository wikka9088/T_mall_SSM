package com.wikka.tmall.test;

import java.sql.DriverManager;

import java.sql.Statement;

import java.sql.Connection;

public class TestMall {
	public static void main(String[] args) {
		//准备分类测试数据：
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmall_ssm?useUnicode=true&characterEncoding=utf8",
                    "root", "admin");
			
			Statement statement = con.createStatement();
			
			for (int i = 1; i <=10 ; i++) {
                String sqlFormat = "insert into category values (null, '测试分类%d')";
                String sql = String.format(sqlFormat, i);
                statement.execute(sql);
            }
			System.out.println("已经成功创建10条分类测试数据");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
