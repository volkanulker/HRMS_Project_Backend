package hrms.northwind.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_advertisements")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobAdvertisement{
	@Id
	@GeneratedValue
	@Column(name="advertisement_id")
	private int advertisementId;
	@Column(name="employer_id")
	private int employerId;
	@Column(name="creation_date")
	private Date creationDate;
	@Column(name="last_application_date")
	private Date lastApplicationDate;
	@Column(name="advertisement_title")
	private String advertisementTitle;
	@Column(name="job_id")
	private int jobId;
//	@Column(name="city_id")
//	private int cityId;
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="needed_employee_number")
	private int neededEmployeeNumber;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;

	

	

}
