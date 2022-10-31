package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

	@Id
	@Column(name = "Contact_No")
	private long no;
	@Column(name = "Contact_Type")
	private String type;
	
	@ManyToOne
	private Employee employee;
}
