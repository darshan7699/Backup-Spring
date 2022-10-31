package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Adress {
  @Id
  @Column(name = "Adress_type")
  private String atype;
  private String doorNo;
  private String street;
  private String locality;
  private String city;
  private String state;
  private String landmark;
  private int pin;
  
  @ManyToOne(cascade = CascadeType.ALL)
  private Employee employee;
}
