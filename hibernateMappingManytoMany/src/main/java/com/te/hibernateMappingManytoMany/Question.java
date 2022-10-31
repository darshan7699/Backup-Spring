package com.te.hibernateMappingManytoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Question {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String qname;
@ManyToMany(cascade = CascadeType.ALL)
private List<Answer>ans;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public List<Answer> getAns() {
	return ans;
}
public void setAns(List<Answer> ans) {
	this.ans = ans;
}
@Override
public String toString() {
	return "Question [id=" + id + ", qname=" + qname + ", ans=" + ans + "]";
}



}
