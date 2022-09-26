package com.te.springcore;

public class User {

	private String name;
	private int id;
	private int age;

	private Database database;
	
	public User() {
	}

	public User(String name, int id, int age, Database database) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.database = database;
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
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

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

}
