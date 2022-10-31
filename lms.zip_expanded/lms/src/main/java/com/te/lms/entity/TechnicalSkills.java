package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TechnicalSkills {

	@Id
	private String rating;
	@Column(name = "Skill_Type")
	private String type;
	@Column(name = "Year_of_Exp")
	private String yoe;
	
	@ManyToOne
	private Employee employee;
}
