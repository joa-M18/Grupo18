package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "AplicadoEn")
@Table(name = "aplicadoEn")
public class AplicadoEn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idAplicadoEn;
	
	private Integer idShot;
	private Integer idCentre;
	
	@Version
	public int version;
	public AplicadoEn() {};
	public AplicadoEn(Integer idShot,Integer idCentre) {
		this.setIdShot(idShot);
		this.setIdCentre(idCentre);
	}
	
	public void setIdShot(Integer idShot) {
		this.idShot = idShot;
	}
	public void setIdCentre(Integer idCentre) {
		this.idCentre = idCentre;
	}
	public Integer getIdShot() {
		return this.idShot;
	}
	public int getIdCentre() {
		return this.idCentre;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	public int getVersion() {
		return this.version;
	}
}
