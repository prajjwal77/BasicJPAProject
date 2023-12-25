package io.NewJpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryCollectionReturn;

import java.util.*;

public class StudentCreate {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setName("Prajjwal");
		
		Student s2=new Student();
		s2.setName("Navneet");
		
		
		StudentIDCard c1=new StudentIDCard();
		c1.setSoftwareVersion("1.0.1");
		
		StudentIDCard c2=new StudentIDCard();
		c2.setSoftwareVersion("1.0.2");
		
		Course cc1=new Course();
		cc1.setCourseName("C-programming");
		
		Course cc2=new Course();
		cc2.setCourseName("DBMS");
		
		
		c1.setStudent(s1);
		c2.setStudent(s2);
		
		
		s1.setCard(c1);
		s2.setCard(c2);
		
		cc1.setStudent1(s1);
		cc2.setStudent1(s1);
		
		List<Course> list=new ArrayList<>();
		list.add(cc1);
		list.add(cc2);
		
		List<Course> list2=new ArrayList<>();
		list2.add(cc2);
		s1.setCourseList(list);
		s2.setCourseList(list2);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpaProject2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(cc1);
		entityManager.persist(cc2);
		entityTransaction.commit();
	}

}
