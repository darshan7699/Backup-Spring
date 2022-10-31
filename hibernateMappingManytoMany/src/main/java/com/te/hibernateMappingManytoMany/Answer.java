package com.te.hibernateMappingManytoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ansname;
	private String postedby;
	@ManyToMany(cascade = CascadeType.ALL)
	List<Question> que;
	
	
	public List<Question> getQue() {
		return que;
	}
	public void setQue(List<Question> que) {
		this.que = que;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnsname() {
		return ansname;
	}
	public void setAnsname(String ansname) {
		this.ansname = ansname;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", ansname=" + ansname + ", postedby=" + postedby + ", que=" + que + "]";
	}
	

	
	
}
