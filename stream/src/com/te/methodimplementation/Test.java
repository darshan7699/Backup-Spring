package com.te.methodimplementation;

public class Test {
	public static void main(String[] args) {
		System.out.println("Using anonymous class");
		// @anonymous class
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
				}
			}
		};
		r.run();
//		Thread thread = new Thread(r);
//		thread.start();
		System.out.println("Usnig lambda expression");

		Runnable r1 = () -> {
			for (int j = 5; j < 10; j++) {
				System.out.println(j);
			}
		};
		Thread thread2 = new Thread(r1);
		thread2.start();
	}
}
