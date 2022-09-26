package com.te.springcoret3;

public class Adress {
   private String landmark;
   private String area;
   private int pin;
   
   
public Adress(String landmark, String area, int pin) {
	super();
	this.landmark = landmark;
	this.area = area;
	this.pin = pin;
}


@Override
public String toString() {
	return "Adress [landmark=" + landmark + ", area=" + area + ", pin=" + pin + "]";
}
   
   
   
}
