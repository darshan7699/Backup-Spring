package com.te.springmvcadmin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Batch {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int srNo;
	private String batchId;
	private String batchName;
	private String mentorName;
	private String technologies;
	private String startDate;
	private String endDate;
	private String status;
	
	
	
	
	

}
