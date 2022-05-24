package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "SupportStaff")
@Table(name = "supportStaff")
public class SupportStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idSupportStaff;
	
	private String area;
	private Integer dni;
	private String nombre;
	
	@Version
	public int Version;

	public SupportStaff() {};
	public SupportStaff(int dni, String area, String nombre) {
		this.setArea(area);
		this.setDni(dni);
		this.setNombre(nombre);
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
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
