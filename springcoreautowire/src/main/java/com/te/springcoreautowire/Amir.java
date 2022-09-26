package com.te.springcoreautowire;

public class Amir {
 private String name;
 private int age;
 private long contactNumber;
 private Phone phone;
 
 public Amir(Phone phone) {
	 this.phone=phone;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getContactNumber() {
	return contactNumber;
}

public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}

public Phone getPhone() {
	return phone;
}

public void setPhone(Phone phone) {
	this.phone = phone;
}

@Override
public String toString() {
	return "Amir [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", phone=" + phone + "]";
}
 
}
