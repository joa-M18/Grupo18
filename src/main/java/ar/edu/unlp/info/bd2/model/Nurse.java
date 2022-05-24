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
public class Nurse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idNurse;
	
	private Integer años;
	private Integer dni;
	private String nombre;
	
	@Version
	public int Version;
	
	public Nurse() {};
	public Nurse(int años,int dni,String nombre) {
		this.setAños(años);
		this.setDni(dni);
		this.setNombre(nombre);
	}
	public Integer getAños() {
		return años;
	}
	public void setAños(Integer años) {
		this.años = años;
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
