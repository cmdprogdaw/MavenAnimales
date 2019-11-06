package mavenAnimales.modelo.informe;

import javax.persistence.EntityManager;

import mavenAnimales.negocio.InformeBean;
import mavenAnimales.util.ConnectionEntityManager;

public class CreateInforme {
	public void create(InformeBean informe) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(informe);
		entityManager.getTransaction().commit();
	}
}
