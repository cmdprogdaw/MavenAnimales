package mavenAnimales.modelo.individuo;

import javax.persistence.EntityManager;

import mavenAnimales.negocio.IndividuoBean;
import mavenAnimales.util.ConnectionEntityManager;

public class CreateIndividuo {
	public void create(IndividuoBean individuo) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(individuo);
		entityManager.getTransaction().commit();
	}
}
