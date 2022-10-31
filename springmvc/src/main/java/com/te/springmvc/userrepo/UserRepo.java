package com.te.springmvc.userrepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;
import com.te.springmvc.service.User;
@Repository
public class UserRepo {
	
	public void saveUser(User user) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Service");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
	
	}
}
