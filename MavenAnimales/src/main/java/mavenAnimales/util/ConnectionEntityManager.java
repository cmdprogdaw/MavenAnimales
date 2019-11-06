package mavenAnimales.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionEntityManager {
	private static EntityManager entityManager = null;

    private ConnectionEntityManager() {
 
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.cris.mavenAnimales.H2");
    	entityManager = emf.createEntityManager();
    	
    }

    public static EntityManager getEntityManager() {
    	
    	if(entityManager==null) {
    		
    		new ConnectionEntityManager();
    	}
    	
		return entityManager;
	}
}
