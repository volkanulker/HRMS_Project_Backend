package hrms.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="personal_web_pages")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonalWebPage {
	@Id
	@GeneratedValue
	@Column(name="personal_web_page_id")
	private int personalWebPageId;
	
	@Column(name="page_name")
	private String pageName;
	
	@Column(name="page_link")
	private String pageLink;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_cv_id")
	private JobSeekerCv jobSeekerCv;
	
}
