package com.te.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address_details")
public class SwiggyAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String area;
	private String landmark;
	private int pin;
	private int flatNo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Swiggy swiggy;

	public int getId() {
		return id;
	}

	public Swiggy getSwiggy() {
		return swiggy;
	}

	public void setSwiggy(Swiggy swiggy) {
		this.swiggy = swiggy;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	@Override
	public String toString() {
		return "SwiggyAddress [id=" + id + ", area=" + area + ", landmark=" + landmark + ", pin=" + pin + ", flatNo="
				+ flatNo + ", swiggy=" + swiggy + "]";
	}

}
