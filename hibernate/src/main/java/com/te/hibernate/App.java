package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
   EntityManagerFactory Factory = Persistence.createEntityManagerFactory("employee");
   EntityManager createEntityManager = Factory.createEntityManager();
   
   
   EntityTransaction transaction = createEntityManager.getTransaction();
   
   Employee employee = new Employee();
   employee.setDesignation("Developer");
   employee.setGender("male");
   employee.setId(50);
    employee.setName("bc");
    employee.setSal(15800);
    employee.getAdress();
    Adress adress = new Adress();
    adress.setArea("nagar");
    adress.setLandmark("hajbjhb");
    adress.setPin(422601);
    
    adress.getAdd();
    Office office = new Office();
    office.setArea("vJN");
    office.setLandmark("INDIQUE");
    office.setOfficeName("TECHNO ELEVATE");
    office.setPin(584512);
    
    transaction.begin();
    createEntityManager.persist(adress);
    createEntityManager.persist(employee);
    createEntityManager.persist(office);
    transaction.commit();
	}
}
