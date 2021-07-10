package hrms.northwind.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Jobs")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Job {
	@Id
	@GeneratedValue
	@Column(name="job_id")
	private int jobId;
	@Column(name="role")
	private String role;
	

}
