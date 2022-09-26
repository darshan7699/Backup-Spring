package com.te.springcoreautowirejavabase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("phone.xml");
	Snippet bean = classPathXmlApplicationContext.getBean(Snippet.class);
	System.out.println(bean);
	
}
}
