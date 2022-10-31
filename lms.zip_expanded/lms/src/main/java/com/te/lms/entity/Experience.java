package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Experience {
	@Id
	private String name;
	@Column(name = "Year_of_Experience")
	private double yoe;
	@Column(name = "Date_of_Joining")
	private String doj;
	@Column(name = "Date_of_Relieving")
	private String dor;
	private String designation;
	private String location;
	
	@ManyToOne
	private Employee employee;
}
