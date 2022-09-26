package com.te.springcoret3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("task3.xml");
		Employee bean = context.getBean("user1", Employee.class);
		System.out.println(bean);
	}
}
