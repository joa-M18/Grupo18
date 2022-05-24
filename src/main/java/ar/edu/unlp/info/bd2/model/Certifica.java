package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "Certifica")
@Table(name = "certifica")
public class Certifica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCertifica;
	
	private Integer idShot;
	private Integer idShotCertificate;
	
	@Version
	public int Version;
	public Certifica() {};
	public Certifica(int idShot, int idShotCertificate) {
		this.setIdShot(idShot);
		this.setIdShotCertificate(idShotCertificate);
	}
	public Integer getIdShot() {
		return idShot;
	}
	public void setIdShot(Integer idShot) {
		this.idShot = idShot;
	}
	public Integer getIdShotCertificate() {
		return idShotCertificate;
	}
	public void setIdShotCertificate(Integer idShotCertificate) {
		this.idShotCertificate = idShotCertificate;
	}
	public int getVersion() {
		return Version;
	}
	public void setVersion(int version) {
		Version = version;
	}
	
}
