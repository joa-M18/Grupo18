package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "ShotCertificate")
@Table(name = "shotCertificate")
public class ShotCertificate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idShotCertificate;
	
	private Integer nroSerie;
	private String fecha;
	
	@Version
	public int Version;

	public ShotCertificate() {};
	public ShotCertificate(int nroSerie, String fecha) {
		this.setFecha(fecha);
		this.setNroSerie(nroSerie);
	}
	
	public Integer getNroSerie() {
		return nroSerie;
	}

	public void setNroSerie(Integer nroSerie) {
		this.nroSerie = nroSerie;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}
	
	
}
