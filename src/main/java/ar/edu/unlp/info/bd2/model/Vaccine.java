package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "Nurse")
@Table(name = "nurse")
public class Vaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idVaccine;
	
	private String nombre;
	
	@Version
	public int Version;
	
	public Vaccine() {};
	public Vaccine(String nombre) {
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}
	
	
}
