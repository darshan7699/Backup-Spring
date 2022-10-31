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
   employee.setId(35);
    employee.setName("amol");
    employee.setSal(15800);
    
    Adress adress = new Adress();
    adress.setArea("nagar");
    adress.setLandmark("24cross");
    adress.setPin(422601);
    
    employee.setAdress(adress);
    
   
    Office office = new Office();
    office.setArea("bhb");
    office.setLandmark("INDIQUE");
    office.setOfficeName("TECHNO ELEVATE");
    office.setPin(584512);
    
   adress.setAdd(office);
    
    transaction.begin();
    createEntityManager.persist(adress);
    createEntityManager.persist(employee);
    createEntityManager.persist(office);
    transaction.commit();
	}
}