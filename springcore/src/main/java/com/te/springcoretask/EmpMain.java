package com.te.springcoretask;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("eml.xml");
		Employee bean = context.getBean("user1", Employee.class);
		System.out.println(bean + "====from user1");

		Employee bean2 = context.getBean("user2", Employee.class);
		System.out.println(bean2 + "===from user2");

	}
}
 