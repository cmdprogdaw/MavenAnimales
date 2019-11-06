package mavenAnimales.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="especie")
public class EspecieBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long cod_especie;
	
	@Column
	private String nombre_esp;
	
	@Column
	private String tipo_esp;
	
	@Column
	private String periodos_migratorios_esp;
	
	@Column
	private String caracteristicas_generales_esp;

	
	@OneToMany(mappedBy="especie")
	private List<IndividuoBean> individuos = new ArrayList<IndividuoBean>();
	
	
	public void addIndividuos(IndividuoBean individuo) {
		
		if(!individuos.contains(individuo)) {
			
			individuos.add(individuo);
			individuo.setEspecie(this);
		}
	}
	
	
	
	
	public List<IndividuoBean> getIndividuos() {
		return individuos;
	}


	public void setIndividuos(List<IndividuoBean> individuos) {
		this.individuos = individuos;
	}



	public long getCod_especie() {
		return cod_especie;
	}

	public void setCod_especie(long cod_especie) {
		this.cod_especie = cod_especie;
	}

	public String getNombre_esp() {
		return nombre_esp;
	}

	public void setNombre_esp(String nombre_esp) {
		this.nombre_esp = nombre_esp;
	}

	public String getTipo_esp() {
		return tipo_esp;
	}

	public void setTipo_esp(String tipo_esp) {
		this.tipo_esp = tipo_esp;
	}

	public String getPeriodos_migratorios_esp() {
		return periodos_migratorios_esp;
	}

	public void setPeriodos_migratorios_esp(String periodos_migratorios_esp) {
		this.periodos_migratorios_esp = periodos_migratorios_esp;
	}

	public String getCaracteristicas_generales_esp() {
		return caracteristicas_generales_esp;
	}

	public void setCaracteristicas_generales_esp(String caracteristicas_generales_esp) {
		this.caracteristicas_generales_esp = caracteristicas_generales_esp;
	}
	
}
