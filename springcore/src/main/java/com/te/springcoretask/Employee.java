package com.te.springcoretask;


public class Employee {
	
private String name;
private int id;
private int age;
private double sal;
private Adress adress;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Adress getAdress() {
	return adress;
}
public void setAdress(Adress adress) {
	this.adress = adress;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", sal=" + sal + ", adress=" + adress + "]";
}


	
}