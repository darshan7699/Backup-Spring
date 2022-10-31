package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SecondaryInfo {
    @Id
    @Column(name = "Pan_No")
	private String pan;
    @Column(name = "Adhar_no")
	private String adhar;
	private String fatherName;
	private String motherName;
	private String spouseName;
	@Column(name = "Passport_No")
	private String passport;
	private String status;
	
	@OneToOne
	private Employee employee;
}
