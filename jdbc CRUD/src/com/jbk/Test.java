package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;





public class Test {
	
	public void demo () throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver load....");
		
		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc crud", "root", "root");
	      
		PreparedStatement ps =c.prepareStatement(null);
		ResultSet rs =ps.executeQuery();
	
	
	.
	
	}
	
	
	
	public static void main(String[] args) throws Exception  {
		Test ts = new Test();
		ts.demo();
	}

}
