package com.te.springcoret2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("task2.xml");
		Employee bean = context.getBean("useremp", Employee.class);
		System.out.println(bean);
	}
}
