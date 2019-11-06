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
@Table(name="torreta")
public class TorretaBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_torreta;
	
	@Column
	private String nombre;
	
	@Column
	private String ubicacion;

	
	@OneToMany(mappedBy="torreta")
	private List<MovimientosBean> movimientos = new ArrayList<MovimientosBean>();
	
	
	public void addMovimientos(MovimientosBean movimiento) {
		
		if(!movimientos.contains(movimiento)) {
			
			movimientos.add(movimiento);
			movimiento.setTorreta(this);
		}
	}
	
	
	
	public List<MovimientosBean> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientosBean> movimientos) {
		this.movimientos = movimientos;
	}

	public long getCod_torreta() {
		return cod_torreta;
	}

	public void setCod_torreta(long cod_torreta) {
		this.cod_torreta = cod_torreta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
