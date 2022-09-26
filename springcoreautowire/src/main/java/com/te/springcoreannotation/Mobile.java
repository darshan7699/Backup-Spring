package com.te.springcoreannotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("vivo")
	private String name;
	@Value("y15")
	private String brand;
	@Value("18500")
	private double price;
	@Autowired
	private Camera cam;
	@Autowired
	private Processer psc;
	

	public Camera getCam() {
		return cam;
	}

	public void setCam(Camera cam) {
		this.cam = cam;
	}

	public Processer getPsc() {
		return psc;
	}

	public void setPsc(Processer psc) {
		this.psc = psc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + ", cam=" + cam + ", psc=" + psc + "]";
	}

	

	

}