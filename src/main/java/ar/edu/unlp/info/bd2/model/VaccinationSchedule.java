package ar.edu.unlp.info.bd2.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "VaccineSchedule")
@Table(name = "vaccineSchedule")
public class VaccinationSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idVaccinationSchedule;
	
	@Version
	public int Version;
	
	public VaccinationSchedule() {}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	};
	
}
