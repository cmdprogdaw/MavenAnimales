package mavenAnimales.modelo.torreta;

import javax.persistence.EntityManager;

import mavenAnimales.negocio.TorretaBean;
import mavenAnimales.util.ConnectionEntityManager;

public class CreateTorreta {
	public void create(TorretaBean torreta) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(torreta);
		entityManager.getTransaction().commit();
	}
}
