package hrms.northwind.entities.concretes;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Verifications")
@Inheritance(strategy=InheritanceType.JOINED)
@Data
public class Verification {
	@Id
	@GeneratedValue
	@Column(name="verification_id")
	private int verificationId;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	public Verification() {
		
	}
	public Verification(int verificationId, boolean isConfirmed) {
		this.verificationId = verificationId;
		this.isConfirmed = isConfirmed;
	}
	

}
