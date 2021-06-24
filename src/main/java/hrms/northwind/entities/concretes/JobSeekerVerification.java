package hrms.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="Job_Seeker_Verifications")
@Entity
@Data
public class JobSeekerVerification extends Verification{
	
	@GeneratedValue
	@Column(name="js_verification_id")
	private int jsVerificationId;
	
	@Column(name="job_seeker_id")
	private int jobSeekerId;
	
	public JobSeekerVerification() {
		
	}
	
	public JobSeekerVerification(int verificationId, boolean isConfirmed, int jsVerificationId, int jobSeekerId) {
		super(verificationId, isConfirmed);
		this.jsVerificationId = jsVerificationId;
		this.jobSeekerId = jobSeekerId;
	}
	
	

}
