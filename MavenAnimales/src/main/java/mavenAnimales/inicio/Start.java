package mavenAnimales.inicio;

import mavenAnimales.modelo.especie.CreateEspecie;
import mavenAnimales.modelo.individuo.CreateIndividuo;
import mavenAnimales.modelo.informe.CreateInforme;
import mavenAnimales.modelo.movimientos.CreateMovimientos;
import mavenAnimales.modelo.torreta.CreateTorreta;
import mavenAnimales.negocio.EspecieBean;
import mavenAnimales.negocio.IndividuoBean;
import mavenAnimales.negocio.InformeBean;
import mavenAnimales.negocio.MovimientosBean;
import mavenAnimales.negocio.TorretaBean;
import mavenAnimales.util.ConnectionEntityManager;

public class Start {

	public static void main(String[] args) {
		
		EspecieBean panda = new EspecieBean();
		panda.setNombre_esp("Panda");
		panda.setTipo_esp("Oso");
		panda.setPeriodos_migratorios_esp("No realiza");
		panda.setCaracteristicas_generales_esp("Blanco y negro");
		
		EspecieBean tigre = new EspecieBean();
		tigre.setNombre_esp("Tigre Bengala");
		tigre.setTipo_esp("Tigre");
		tigre.setPeriodos_migratorios_esp("Subida del mar");
		tigre.setCaracteristicas_generales_esp("Naranja y rayas negras");
		
		IndividuoBean panda1 = new IndividuoBean();
		panda1.setPeso("100kg");
		panda1.setDimensiones("1.5m");
		
		IndividuoBean panda2 = new IndividuoBean();
		panda2.setPeso("97kg");
		panda2.setDimensiones("1.3m");
		
		MovimientosBean mov1 = new MovimientosBean();
		mov1.setFecha("10/02/2019");
		mov1.setTipo("Comer bambú");
		mov1.setHora("14:06");
		
		TorretaBean torreta1 = new TorretaBean();
		torreta1.setNombre("Torre Norte");
		torreta1.setUbicacion("China");
		
		InformeBean inf1 = new InformeBean();
		inf1.setFecha("11/02/2019");
		
		
		panda.addIndividuos(panda1);
		panda.addIndividuos(panda2);
		
		panda1.addMovimientos(mov1);
		
		torreta1.addMovimientos(mov1);
		
		inf1.addMovimientos(mov1);
		
		
		CreateEspecie createEspecie = new CreateEspecie();
		createEspecie.create(panda);
		createEspecie.create(tigre);
		
		CreateIndividuo createIndividuo = new CreateIndividuo();
		createIndividuo.create(panda1);
		createIndividuo.create(panda2);
		
		CreateTorreta createTorreta = new CreateTorreta();
		createTorreta.create(torreta1);
		
		CreateInforme createInforme = new CreateInforme();
		createInforme.create(inf1);
		
		CreateMovimientos createMovimientos = new CreateMovimientos();
		createMovimientos.create(mov1);
		
		
		
		
		ConnectionEntityManager.getEntityManager().close();
	}

}
