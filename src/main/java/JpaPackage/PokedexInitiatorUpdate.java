package JpaPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class PokedexInitiatorUpdate {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpaProject");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Pokemon p =entityManager.find(Pokemon.class, "Pikachu");
	if(p!=null) {
		p.setPower(200);
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}
	else {
		System.out.println("entry does not exist");
	}
	}

}
