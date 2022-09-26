package com.te.springcoreautowirejavabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
     public static void main(String[] args) throws Exception {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		Statement statement = connection.createStatement();
		String st=("INSERT INTO EMP VALUES ('TRUPTI',60 ,5100, 02,286, 'MENTOR', 3232, '17 AUG 15' ,100)");
		statement.execute(st);
		
        
        	 connection.close();
        	 statement.close();
        	 System.out.println("query executed");
		
		
	} 
}
