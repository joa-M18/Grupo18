package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "Compone")
@Table(name = "compone")
public class Compone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCompone;
	
	private Integer idVaccine;
	private Integer idVaccinationSchedule;
	
	@Version
	public int Version;
	
	public Compone() {};
	public Compone(int idVaccine, int idVaccionationSchedule) {
		this.setIdVaccine(idVaccine);
		this.setIdVaccinationSchedule(idVaccinationSchedule);
	}
	public Integer getIdVaccine() {
		return idVaccine;
	}
	public void setIdVaccine(Integer idVaccine) {
		this.idVaccine = idVaccine;
	}
	public Integer getIdVaccinationSchedule() {
		return idVaccinationSchedule;
	}
	public void setIdVaccinationSchedule(Integer idVaccinationSchedule) {
		this.idVaccinationSchedule = idVaccinationSchedule;
	}
	public int getVersion() {
		return Version;
	}
	public void setVersion(int version) {
		Version = version;
	}
	
	
}
