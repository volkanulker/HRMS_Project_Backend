package hrms.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Table(name="Employers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
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
	

	
	

}
