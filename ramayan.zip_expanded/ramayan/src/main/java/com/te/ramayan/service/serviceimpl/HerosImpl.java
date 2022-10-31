package com.te.ramayan.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ramayan.entity.Heros;
import com.te.ramayan.repo.HerosRepo;
import com.te.ramayan.servi.HerosInterface;

@Service
public class HerosImpl implements HerosInterface{

	@Autowired
	HerosRepo herosRepo;
	
	@Override
	public Heros save(Heros heros) {
		Heros save = herosRepo.save(heros);
		return save;
	}

	@Override
	public Heros findby(String name) {
		Heros findByName = herosRepo.findByName(name);
		return findByName;
	}

}
