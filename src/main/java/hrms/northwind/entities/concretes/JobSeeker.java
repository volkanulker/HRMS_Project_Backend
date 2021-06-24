package hrms.northwind.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.Data;
@Entity // tell that is an entity
@Table(name="Job_Seekers")
@Data // lombok brings getters and setters
public class JobSeeker extends Person{
	@GeneratedValue
	@Column(name="id")
	private int jobseekerId;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="birth_date")
	private Date birth_date;
	
	@Column(name="password")
	private String password;
	
	public JobSeeker() {
		
	}
	
	public JobSeeker(int personId, String name, String surname, String email, int jobseekerId, String ssn, Date birth_date,
			String password) {
		super(personId, name, surname, email);
		this.jobseekerId = jobseekerId;
		this.ssn = ssn;
		this.birth_date = birth_date;
		this.password = password;
	}
	
	
	
	

}
