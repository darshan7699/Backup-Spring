package com.te.springcoret2;

public class Adress {
   
	private String area;
	private String bno;
	private int pin;
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Adress [area=" + area + ", bno=" + bno + ", pin=" + pin + "]";
	}
	
	
	
	
}
