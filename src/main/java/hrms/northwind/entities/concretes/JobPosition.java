package hrms.northwind.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="job_positions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="job_position_id")
	private int jobPositionId;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@OneToMany(mappedBy="jobPosition")
	private List<JobAdvertisement> jobAdvertisements;
	
	@OneToMany(mappedBy="jobPosition")
	private List<JobExperience> jobExperiences;
	

}
