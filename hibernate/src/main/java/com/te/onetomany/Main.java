package com.te.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();

		List<SwiggyAddress> list = new ArrayList<>();
		Swiggy swiggy = new Swiggy();
		swiggy.setEmail("darshan@gmail");
		swiggy.setName("Darshan");
		swiggy.setPhoneNumber(9146412004l);
	
		
		SwiggyAddress add = new SwiggyAddress();
		add.setArea("JayaNagar");
		add.setFlatNo(10);
		add.setLandmark("Kolkatta Hotel");
		add.setPin(580156);
	     add.setSwiggy(swiggy);
		
		SwiggyAddress add2 = new SwiggyAddress();
		add2.setArea("Nagar");
		add2.setFlatNo(20);
		add2.setLandmark(" Hotel");
		add2.setPin(582056);
		add2.setSwiggy(swiggy);
		

		list.add(add2);
		list.add(add);
		swiggy.setAdr(list);

		transaction.begin();
		
		createEntityManager.persist(swiggy);
		
		
		transaction.commit();

		System.out.println("program end");
	}
}
