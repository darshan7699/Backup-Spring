package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	ApplicationContext Context = new AnnotationConfigApplicationContext(Configue.class);
	Mobile bean = Context.getBean(Mobile.class);
	System.out.println(bean);
	bean.getPsc().os();
	
	
}
}