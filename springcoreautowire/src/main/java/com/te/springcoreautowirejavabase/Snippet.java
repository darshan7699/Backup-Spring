package com.te.springcoreautowirejavabase;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Snippet implements InitializingBean,DisposableBean {
	
	
	private int a;
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	

	public Snippet() {
    System.out.println("from constructor");
	}
	
	public void m1() {
		System.out.println("This is From m1");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
      System.out.println("after Properties");		
	}

	@Override
	public void destroy() throws Exception {
        System.out.println("Destroy");		
	}
}

