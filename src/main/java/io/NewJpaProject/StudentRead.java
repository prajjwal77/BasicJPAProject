package io.NewJpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpaProject2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
//		Student s1=entityManager.find(Student.class, 1);
//		System.out.println(s1.getName());
//		
//		System.out.println(s1.getCard().getSoftwareVersion()+ "  "+ s1.getCard().getIdCardNumber());
//
//		StudentIDCard c1=entityManager.find(StudentIDCard.class, 3);
//		System.out.println(c1.getStudent().getName()+" "+c1.getIdCardNumber()+" "+c1.getSoftwareVersion());
		
//		Course cc1=entityManager.find(Course.class, 5);
//		System.out.println(cc1.getCourseName()+" "+ cc1.getStudent1().getName());
		
		Student s1=entityManager.find(Student.class, 1);
		System.out.println(s1.getName());
		for(Course c: s1.getCourseList()) {
			System.out.println(c.getCourseName());
		}
	}

}
