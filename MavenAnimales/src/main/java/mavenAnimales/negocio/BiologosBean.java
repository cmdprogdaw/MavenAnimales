package mavenAnimales.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="biologos")
public class BiologosBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_biologo;
}
