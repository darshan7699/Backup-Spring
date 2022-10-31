package com.te.springmvctask;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeePrimary_Info {
@Id
private int id;
private String name;
private String joiningDate;
private String birthDate;
private String mail;
private String bloodGroup;
private String gender;
private String designation;
private String nationality;
private String status;



}
