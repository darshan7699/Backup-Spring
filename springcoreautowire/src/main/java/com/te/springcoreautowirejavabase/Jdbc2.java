package com.te.springcoreautowirejavabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
public static void main(String[] args) throws Exception {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root", "root");
	Statement createStatement = connection.createStatement();
	ResultSet query = createStatement.executeQuery("select * from emp");
	
	while(query.next()) {
		System.out.println(query.getString(1)+" = "+query.getInt(2)+" = "
				+query.getInt(3)+" = "+query.getInt(4)+" = "+query.getInt(5)+" = "
				+query.getString(6)+" = "+query.getInt(7)+" = "+query.getString(8)+" = "
						+ " = "+query.getInt(9));
	}
	
	connection.close();
	createStatement.close();
}
}
