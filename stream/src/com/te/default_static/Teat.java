package com.te.default_static;

public interface Teat {

	public static void m1() {
		System.out.println("The method m1 from Static ");
	}
	
	public default void m2() {
		System.out.println("The method from default only");
	}
}
