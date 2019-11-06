package mavenAnimales.modelo.biologos;

import javax.persistence.EntityManager;

import mavenAnimales.negocio.BiologosBean;
import mavenAnimales.util.ConnectionEntityManager;

public class CreateBiologos {
	
	public void create(BiologosBean biologos) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(biologos);
		entityManager.getTransaction().commit();
	}
}
