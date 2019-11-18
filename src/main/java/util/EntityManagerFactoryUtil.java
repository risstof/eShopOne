package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerFactoryUtil {

	private static EntityManager entityManager;
	
	public static EntityManager getEntityManager() {
		if(entityManager==null){
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("booksStoreOracleDb");
			return entityManagerFactory.createEntityManager();
		}
		return entityManager;
	}
	
}
