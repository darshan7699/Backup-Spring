package com.te.springcore;

public class Oracle implements Database{

	@Override
	public void save() {
     System.out.println("from oracle");		
	}

}
