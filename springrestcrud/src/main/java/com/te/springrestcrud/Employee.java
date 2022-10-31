package com.te.springrestcrud;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Component
@Data
public class Employee {
	@Id
	private int id;
	private String name;
	private String designation;
	private double sal;

}
