package hrms.northwind.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="Employer_Verifications")
@Data
public class EmployerVerification extends Verification{
	
	@GeneratedValue
	@Column(name="employer_verification_id")
	private int employerVerificationId;
	
	@Column(name="employer_id")
	private int employerId;
	
	public EmployerVerification() {
		
	}
	
	public EmployerVerification(int verificationId, boolean isConfirmed, int employerVerificationId, int employerId) {
		super(verificationId, isConfirmed);
		this.employerVerificationId = employerVerificationId;
		this.employerId = employerId;
	}
	
	

}
