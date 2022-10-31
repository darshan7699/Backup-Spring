package com.te.ramayan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ramayan.entity.Heros;

@Repository
public interface HerosRepo extends JpaRepository<Heros, Integer> {

	public Heros findByName(String name);

}
