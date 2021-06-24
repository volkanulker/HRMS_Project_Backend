package hrms.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Table;

import lombok.Data;
@Table(name="Employers")
@Entity
@Data
public class Employer extends Person {
	
	@GeneratedValue
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="password")
	private String password;
	
	public Employer() {
		
	}
	public Employer(int personId, String name, String surname, String email, int employerId, String company_name, String website,
			String phone_number, String password) {
		super(personId, name, surname, email);
		this.employerId = employerId;
		this.company_name = company_name;
		this.website = website;
		this.phone_number = phone_number;
		this.password = password;
	}
	
	

}
