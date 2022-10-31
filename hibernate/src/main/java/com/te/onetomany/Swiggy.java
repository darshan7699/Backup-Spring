package com.te.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "swiggy_details")
public class Swiggy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phoneNumber;

	@OneToMany(cascade = CascadeType.ALL)
	private List<SwiggyAddress> adr;

	@Override 
	public String toString() {
		return "Swiggy [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", adr=" + adr + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<SwiggyAddress> getAdr() {
		return adr;
	}

	public void setAdr(List<SwiggyAddress> adr) {
		this.adr = adr;
	}

}
