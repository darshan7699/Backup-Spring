package com.te.default_static;

public class Test implements Teat,AmbiquityTest {

	@Override
	public void m2() {
		System.out.println("FROM TEST");
	   // AmbiquityTest.super.m2();
		//Teat.super.m2();
	}
	public static void main(String[] args) {
		Teat.m1();
		Test test = new Test();
		test.m2();
		
		
	}

}
