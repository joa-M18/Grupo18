package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "AplicadoA")
@Table(name = "aplicadoA")
public class AplicadoA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idAplicadoA;
	
	private Integer idShot;
	private Integer idPatient;
	
	@Version
	public int version;
	
	public AplicadoA() {};
	public AplicadoA(Integer idShot,Integer idPatient) {
		this.setIdShot(idShot);
		this.setIdPatient(idPatient);
	}
	
	public void setIdShot(Integer idShot) {
		this.idShot = idShot;
	}
	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}
	public Integer getIdShot() {
		return this.idShot;
	}
	public int getIdPatient() {
		return this.idPatient;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	public int getVersion() {
		return this.version;
	}
	
}
