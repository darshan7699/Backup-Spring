package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EducationDetails {
    @Id
    @Column(name = "Education_Type")
	private String etype;
    @Column(name = "Year_of_Passing")
	private int yop;
	private String percentage;
	@Column(name = "University_name")
	private String uname;
	@Column(name = "Institute_Name")
	private String institute;
	private String specialization;
	private String state;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
}
