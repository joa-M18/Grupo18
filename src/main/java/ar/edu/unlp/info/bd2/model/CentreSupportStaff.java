package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "CentreSupportStaff")
@Table(name = "centreSupportStaff")
public class CentreSupportStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCentreSupportStaff;
	
	private Integer idCentre;
	private Integer idSupportStaff;
	
	@Version
	public int Version;
	
	public CentreSupportStaff() {};
	public CentreSupportStaff(int idCentre, int idSupportStaff) {
		this.setIdCentre(idCentre);
		this.setIdSupportStaff(idSupportStaff);
	}
	public Integer getIdCentre() {
		return idCentre;
	}
	public void setIdCentre(Integer idCentre) {
		this.idCentre = idCentre;
	}
	public Integer getIdSupportStaff() {
		return idSupportStaff;
	}
	public void setIdSupportStaff(Integer idSupportStaff) {
		this.idSupportStaff = idSupportStaff;
	}
	public int getVersion() {
		return Version;
	}
	public void setVersion(int version) {
		Version = version;
	}
	
}
