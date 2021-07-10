package hrms.northwind.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Employer_Verifications")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class EmployerVerification extends Verification{
	
	@GeneratedValue
	@Column(name="employer_verification_id")
	private int employerVerificationId;
	
	@Column(name="employer_id")
	private int employerId;
	

	

}
