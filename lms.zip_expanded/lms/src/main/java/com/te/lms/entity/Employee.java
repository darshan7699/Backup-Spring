package com.te.lms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;

	@OneToOne(cascade = CascadeType.ALL)
	private Primary_Info primary;

	@OneToOne(cascade = CascadeType.ALL)
	private SecondaryInfo secondary;

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<EducationDetails> education;

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<Adress> adress;

	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bank;

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<TechnicalSkills> skill;

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<Experience> experience;

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<Contact> contact;

}
