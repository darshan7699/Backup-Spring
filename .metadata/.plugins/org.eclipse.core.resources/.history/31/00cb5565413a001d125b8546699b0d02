package com.te.springcoreautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("phone.xml");
       Amir bean = context.getBean(Amir.class);
       System.out.println(bean);
    }
}
