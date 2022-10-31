package com.te.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springmvc.userrepo.UserRepo;

@Service
public class UserService {
     @Autowired
	UserRepo us;
    
	public boolean check(User user) {
		if(user.getPass().equals(user.getConfpass())) {
			us.saveUser(user);
			return true;
		}
		return false;	
	}
}
