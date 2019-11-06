package mavenAnimales.modelo.movimientos;

import javax.persistence.EntityManager;

import mavenAnimales.negocio.MovimientosBean;
import mavenAnimales.util.ConnectionEntityManager;

public class CreateMovimientos {
	public void create(MovimientosBean movimientos) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(movimientos);
		entityManager.getTransaction().commit();
	}
}
