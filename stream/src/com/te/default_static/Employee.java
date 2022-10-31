package com.te.default_static;



public class Employee implements Comparable<Employee> {
	private String name;
	private int id;
	private Double sal;

	public Employee(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getsal() {
		return sal;
	}

	public void setContactNumber(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id-o.id; 
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	}

