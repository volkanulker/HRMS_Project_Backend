package hrms.northwind.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Entity // tell that is an entity
@Table(name="Job_Seekers")
@NoArgsConstructor
@AllArgsConstructor
@Data 
@EqualsAndHashCode(callSuper = true)
public class JobSeeker extends Person{
	@GeneratedValue
	@Column(name="id")
	private int jobseekerId;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="password")
	private String password;
	

	
	
	

}
