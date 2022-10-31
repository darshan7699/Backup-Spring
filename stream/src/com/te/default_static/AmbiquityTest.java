package com.te.default_static;

public interface AmbiquityTest {
	
	public default void m2() {
		System.out.println("This is from AmbiquityTEst");
	}
}
