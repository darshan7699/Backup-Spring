package com.te.springcoreautowirejavabase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Owner {
@SuppressWarnings("resource")
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfiguration.class);
	Laptop bean = context.getBean(Laptop.class);
	System.out.println(bean);
}
}
