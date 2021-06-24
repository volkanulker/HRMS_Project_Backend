package hrms.northwind.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Job_Advertisements")
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
	@Column(name="city_id")
	private int cityId;
	@Column(name="job_description")
	private String jobDescription;
	
	public JobAdvertisement() {
		
	}
	
	public JobAdvertisement(int advertisementId, int employerId, Date creationDate, Date lastApplicationDate,
			String advertisementTitle, int jobId, int cityId, String jobDescription) {
		this.advertisementId = advertisementId;
		this.employerId = employerId;
		this.creationDate = creationDate;
		this.lastApplicationDate = lastApplicationDate;
		this.advertisementTitle = advertisementTitle;
		this.jobId = jobId;
		this.cityId = cityId;
		this.jobDescription = jobDescription;
	}
	
	

}
