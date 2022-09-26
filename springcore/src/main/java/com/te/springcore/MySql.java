package com.te.springcore;

public class MySql implements Database {

	@Override
	public void save() {
		System.out.println("from my SQL database");
	}

}
