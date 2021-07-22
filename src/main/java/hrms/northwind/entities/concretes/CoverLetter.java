package hrms.northwind.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cover_letters")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CoverLetter {
	
	@Id
	@GeneratedValue
	@Column(name="cover_letter_id")
	private int coverLetterId;
	
	
	@Column(name="cover_letter_content")
	private String coverLetterContent;
	
	@Column(name="cover_letter_title")
	private String coverLettertitle;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@OneToOne()
	@JoinColumn(name="job_seeker_cv_id")
	private JobSeekerCv jobSeekerCv;

}
