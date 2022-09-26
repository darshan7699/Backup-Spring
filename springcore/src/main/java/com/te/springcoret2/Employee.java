package com.te.springcoret2;

public class Employee {

	
	private String name;
	private int id;
	private String dname;
	
	private Adress adress;

	
	public Employee(String name, int id, String dname, Adress adress) {
		super();
		this.name = name;
		this.id = id;
		this.dname = dname;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dname=" + dname + ", adress=" + adress + "]";
	}
	
	
}
