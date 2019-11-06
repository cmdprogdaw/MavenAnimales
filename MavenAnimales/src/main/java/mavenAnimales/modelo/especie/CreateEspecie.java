package mavenAnimales.modelo.especie;

import javax.persistence.EntityManager;

import mavenAnimales.negocio.EspecieBean;
import mavenAnimales.util.ConnectionEntityManager;

public class CreateEspecie {
	
	public void create(EspecieBean especie) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(especie);
		entityManager.getTransaction().commit();
	}
}
