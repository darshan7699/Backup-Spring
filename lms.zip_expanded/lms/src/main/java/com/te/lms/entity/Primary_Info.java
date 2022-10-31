package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Primary_Info {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column(name = "Employee_Name")
	private String ename;
	@Column(name = "Date_of_Joining")
	private String doj;
	@Column(name = "Date_of_Birth")
	private String dob;
	private String mail;
	private String bloodGroup;
	private String designation;
	private String gender;
	private String nationality;
	private String status;
	
	@OneToOne
	private Employee employee;
}
