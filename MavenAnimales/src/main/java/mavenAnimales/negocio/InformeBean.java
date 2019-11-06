package mavenAnimales.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="informe")
public class InformeBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_informe;
	
	@Column
	private String fecha;

	
	@ManyToMany(mappedBy="informes")
	private List<MovimientosBean> movimientos = new ArrayList<MovimientosBean>();
	
	
	/**
	 * Operación que permite añadir movimientos a los informes y este informe a la lista de movimientos
	 * @param movimiento
	 */
	public void addMovimientos(MovimientosBean movimiento) {
		
		if(!movimientos.contains(movimiento)) {
			
			movimientos.add(movimiento);
			
			// decirle al movimiento que añada este informe
			List<InformeBean> informes = movimiento.getInformes();
			if(!informes.contains(this)) {
				
				informes.add(this);
			}
		}
	}
	
	
	@ManyToMany(mappedBy="informes")
	private List<BiologosBean> biologos = new ArrayList<BiologosBean>();
	
	
	public void addBiologos(BiologosBean biologo) {
		
		if(!biologos.contains(biologo)) {
			
			biologos.add(biologo);
			
			List<InformeBean> informes = biologo.getInformes();
			if(!informes.contains(this)) {
				
				informes.add(this);
			}
		}
	}
	
	
	
	
	public List<BiologosBean> getBiologos() {
		return biologos;
	}


	public void setBiologos(List<BiologosBean> biologos) {
		this.biologos = biologos;
	}


	public List<MovimientosBean> getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(List<MovimientosBean> movimientos) {
		this.movimientos = movimientos;
	}


	public long getCod_informe() {
		return cod_informe;
	}

	public void setCod_informe(long cod_informe) {
		this.cod_informe = cod_informe;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
