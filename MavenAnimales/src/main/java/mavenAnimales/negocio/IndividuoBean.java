package mavenAnimales.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="individuo")
public class IndividuoBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long cod_individuo;
	
	@Column
	private String peso;
	
	@Column
	private String dimensiones;

	
	@ManyToOne
	@JoinColumn(name="FK_especie")
	private EspecieBean especie;
	
	
	@OneToMany(mappedBy="individuo")
	private List<MovimientosBean> movimientos = new ArrayList<MovimientosBean>();
	
	public void addMovimientos(MovimientosBean movimiento) {
		
		if(!movimientos.contains(movimiento)) {
			
			movimientos.add(movimiento);
			movimiento.setIndividuo(this);
		}
	}
	
	
	
	public List<MovimientosBean> getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(List<MovimientosBean> movimientos) {
		this.movimientos = movimientos;
	}


	public EspecieBean getEspecie() {
		return especie;
	}

	public void setEspecie(EspecieBean especie) {
		this.especie = especie;
	}

	public long getCod_individuo() {
		return cod_individuo;
	}

	public void setCod_individuo(long cod_individuo) {
		this.cod_individuo = cod_individuo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	
	
}
