package com.te.springmvcadmin.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springmvcadmin.Batch;
import com.te.springmvcadmin.Mentor;

@Repository
public class Repo {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("batch");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public List<Batch> addData(Batch batch) {
		manager.persist(batch);
		transaction.begin();
		transaction.commit();
		String query = "from Batch";
		Query createQuery = manager.createQuery(query);
		List<Batch> list = createQuery.getResultList();
		return list;

	}

	public void editData(Batch edit) {
		Batch batch = manager.find(Batch.class, edit.getSrNo());
		batch.setBatchId(edit.getBatchId());
		batch.setBatchName(edit.getBatchName());
		batch.setEndDate(edit.getEndDate());
		batch.setMentorName(edit.getMentorName());
		batch.setStartDate(edit.getStartDate());
		batch.setStatus(edit.getStatus());
		batch.setTechnologies(edit.getTechnologies());
		manager.persist(batch);
		transaction.begin();
		transaction.commit();

	}

	public List<Mentor> mentorAdd(Mentor mentor) {
		manager.persist(mentor);
		transaction.begin();
		transaction.commit();
		String query = "from Mentor";
		Query createQuery = manager.createQuery(query);
		List<Mentor> resultList = createQuery.getResultList();
		return resultList;
	}

	public void mentorEdit(Mentor mentor) {
		Mentor find = manager.find(Mentor.class, mentor.getSr_no());
		find.setEid(mentor.getEid());
		find.setMail(mentor.getMail());
		find.setMentorName(mentor.getMentorName());
		find.setSkill(mentor.getSkill());
		manager.persist(find);
		transaction.begin();
		transaction.commit();

	}

	public void deleteMentor(Mentor mentor) {
		Mentor find = manager.find(Mentor.class, mentor.getSr_no());
		manager.remove(find);
		transaction.begin();
		transaction.commit();
	}

	public void deleteBatch(Batch batch) {
		Batch find = manager.find(Batch.class, batch.getSrNo());
		manager.remove(find);
		transaction.begin();
		transaction.commit();
	}

}
