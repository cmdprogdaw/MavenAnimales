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
@Table(name="biologos")
public class BiologosBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_biologo;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String provincia;
	
	@Column
	private String fecha_titulacion;

	
	@ManyToMany
	private List<InformeBean> informes = new ArrayList<InformeBean>();
	
	
	
	public List<InformeBean> getInformes() {
		return informes;
	}

	public void setInformes(List<InformeBean> informes) {
		this.informes = informes;
	}

	public long getCod_biologo() {
		return cod_biologo;
	}

	public void setCod_biologo(long cod_biologo) {
		this.cod_biologo = cod_biologo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getFecha_titulacion() {
		return fecha_titulacion;
	}

	public void setFecha_titulacion(String fecha_titulacion) {
		this.fecha_titulacion = fecha_titulacion;
	}
	
	
}
