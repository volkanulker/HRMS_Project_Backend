package hrms.northwind.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_advertisements")
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cities"})

public class JobAdvertisement{
	@Id
	@GeneratedValue
	@Column(name="advertisement_id")
	private int advertisementId;
	
	@Column(name="advertisement_title")
	private String advertisementTitle;
	

	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	

	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@Column(name="job_description")
	private String jobDescription;


	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	@Column(name="last_application_date")
	private Date lastApplicationDate;
	

	@Column(name="needed_employee_number")
	private int neededEmployeeNumber;
	
	@Column(name="isActive")
	private boolean isActive;

	

	

	

}
