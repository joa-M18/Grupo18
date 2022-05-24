package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "Shot")
@Table(name = "shot")
public class Shot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idShot;
	
	private Integer idVaccine;
	
	@Version
	public int Version;
	
	public Shot() {};
	public Shot(int idVaccine) {
		this.setIdVaccine(idVaccine);
	}
	
	public Integer getIdVaccine() {
		return idVaccine;
	}

	public void setIdVaccine(Integer idVaccine) {
		this.idVaccine = idVaccine;
	}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	};
	
	
	
}
