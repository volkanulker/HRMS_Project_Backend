package hrms.northwind.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name="Job_Seeker_Verifications")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class JobSeekerVerification extends Verification{
	@GeneratedValue
	@Column(name="js_verification_id")
	private int jsVerificationId;
	
	@Column(name="job_seeker_id")
	private int jobSeekerId;


}
