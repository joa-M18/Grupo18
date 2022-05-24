package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "CentreNurse")
@Table(name = "centreNurse")
public class CentreNurse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCentreNurse;
	
	private Integer idCentre;
	private Integer idNurse;
	
	@Version
	public int Version;

	public CentreNurse() {};
	public CentreNurse(int idCentre,int idNurse) {
		this.setIdCentre(idCentre);
		this.setIdNurse(idNurse);
	}
	
	public Integer getIdCentre() {
		return idCentre;
	}

	public void setIdCentre(Integer idCentre) {
		this.idCentre = idCentre;
	}

	public Integer getIdNurse() {
		return idNurse;
	}

	public void setIdNurse(Integer idNurse) {
		this.idNurse = idNurse;
	}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}
	
	
}
