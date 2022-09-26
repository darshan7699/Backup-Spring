package com.te.springcoret3;

public class Employee {
       private String name;
       private double sal;
       private int id;
       private Adress adress;
       
	public Employee(String name, double sal, int id, Adress adress) {
		super();
		this.name = name;
		this.sal = sal;
		this.id = id;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", id=" + id + ", adress=" + adress + "]";
	}
       
       
       
}
