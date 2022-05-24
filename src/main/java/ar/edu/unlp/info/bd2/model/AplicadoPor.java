package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "AplicadoPor")
@Table(name = "aplicadoPor")
public class AplicadoPor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idAplicadoPor;
	
	private Integer idShot;
	private Integer idNurse;
	
	@Version
	public int version;
	public AplicadoPor() {};
	public AplicadoPor(Integer idShot,Integer idNurse) {
		this.setIdShot(idShot);
		this.setIdNurse(idNurse);
	}
	
	public void setIdShot(Integer idShot) {
		this.idShot = idShot;
	}
	public void setIdNurse(Integer idNurse) {
		this.idNurse = idNurse;
	}
	public Integer getIdShot() {
		return this.idShot;
	}
	public int getIdNurse() {
		return this.idNurse;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	public int getVersion() {
		return this.version;
	}
}
