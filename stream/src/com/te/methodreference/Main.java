package com.te.methodreference;

public class Main {
	
	public Main() {
		System.out.println("Constructor");
	}

	public void darshan() {
		System.out.println("Baki ky challay mg...");
	}
	
	public void darshan1() {
		System.out.println("Namskar mandali..kase ahat? hastay na !!");
	}
//	public void demo() {
//		System.out.println("Baki ky challay mg...");
//	}
	public static void main(String[] args) {
		Main main = new Main();
		Test t=main::darshan;
		Test t1=new Main()::darshan1;
		t1.m1();
		Test t11 = main::darshan;
		t11.m1();
		Test t2=Main::new;
		t2.m1();
  }
}
