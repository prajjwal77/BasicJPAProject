package JpaPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpaProject");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		Pokemon pokemon=entityManager.find(Pokemon.class, "Pikachu");
		
		System.out.println(pokemon);

	}

}
