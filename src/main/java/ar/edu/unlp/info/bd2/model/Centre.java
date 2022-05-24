package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "Centre")
@Table(name = "centre")
public class Centre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCentre;
	private String name;
	
	@Version
	public int version;
	
	public Centre() {};
	public Centre(String name) {
		this.setName(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setVersion(int version) {
		this.version = version;
	}
	public int getVersion() {
		return this.version;
	}
}
