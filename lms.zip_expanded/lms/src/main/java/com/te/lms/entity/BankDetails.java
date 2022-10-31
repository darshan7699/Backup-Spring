package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BankDetails {
	@Id
	@Column(name = "Account_No")
	private long acc;
	private String bankName;
	@Column(name = "Account_Type")
	private String type;
	private String ifsc;
	private String state;
	
	@OneToOne
	private Employee employee;

}
