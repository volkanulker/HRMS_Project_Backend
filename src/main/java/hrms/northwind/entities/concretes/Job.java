package hrms.northwind.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="Jobs")
@Data
public class Job {
	@Id
	@GeneratedValue
	@Column(name="job_id")
	private int jobId;
	@Column(name="role")
	private String role;
	
	public Job() {
		
	}
	
	public Job(int jobId, String role) {
		this.jobId = jobId;
		this.role = role;
	}

}
