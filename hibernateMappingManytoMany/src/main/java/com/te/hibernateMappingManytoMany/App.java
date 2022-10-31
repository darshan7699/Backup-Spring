package com.te.hibernateMappingManytoMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ManytoMany");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        
        Question question = new Question();
        question.setQname("What is java");
        
        Question question2 = new Question();
        question2.setQname("what is API");
        
        List<Question> asList = Arrays.asList(question);
        List<Question> asList3 = Arrays.asList(question2);
        
      List<Answer> list = new ArrayList<>();
        
        Answer answer = new Answer();
        
        answer.setAnsname("java is Programming lang");
        answer.setPostedby("darshan");
        answer.setQue(asList);
        
        Answer ansq1 = new Answer();
        ansq1.setAnsname("java is robust");
        ansq1.setPostedby("bhagwat");
        ansq1.setQue(asList3);
        
        list.add(ansq1);
        list.add(answer);
        question.setAns(list);
        
        
        Answer answer2 = new Answer();
        answer2.setAnsname("Application programming interface");
        answer2.setPostedby("Ajay");
      
        
        Answer ansq2 = new Answer();
        ansq2.setAnsname("predefined classes and Interface");
        ansq2.setPostedby("manish");
        
        List<Answer> asList2 = Arrays.asList(answer2,ansq2);
        question2.setAns(asList2);
        
        transaction.begin();
        manager.persist(question);
        manager.persist(question2);
        transaction.commit();
        
        
    }
}
