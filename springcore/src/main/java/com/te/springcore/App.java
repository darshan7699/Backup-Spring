package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++++++++++++");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml","Text.xml");
		
		User bean = context.getBean("cons",User.class);
		bean.getDatabase().save();
		
		
		
		
		
		
		
//		User bean = context.getBean("user1",User.class);
//		bean.getDatabase().save();
//		
//		User bean2 = context.getBean("user2",User.class);
//		bean2.getDatabase().save();
//		
//		
		
		
		
		
//		using two bean
//		Object bean = context.getBean("user1");
//		System.out.println(bean);
//		User u1=(User)bean;
//		u1.setAge(25);
//		System.out.println(u1+"=======updated");
//		
//		Object bean2 = context.getBean("user2");
//		System.out.println(bean2);
//		
     //using class
//		User bean = context.getBean(User.class);
//		bean.setAge(15);
//		System.out.println(bean);
	}
}