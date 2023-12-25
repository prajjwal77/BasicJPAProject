package JpaPackage;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

public class PokedexInitiatorCreate {

	public static void main(String[] args) throws Exception{
		Pokemon p1=new Pokemon();
		p1.setName("Pikachu");
		p1.setPower(100);
		p1.setType("Electrical");
		//p1.setColor("yellow");
		p1.setColor(Color.Yellow);
		
		Pokemon p2=new Pokemon();
		p2.setName("Pikapika");
		p2.setPower(100);
		p2.setType("Fire");
		p2.setColor(Color.Red);
		//p2.setColor("red");
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpaProject");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		

		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2); 
		entityTransaction.commit();
		
	}

}
