package hrms.northwind.entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity // tell that is an entity
@Table(name="job_seekers")
@NoArgsConstructor
@AllArgsConstructor
@Data 
@EqualsAndHashCode(callSuper = true)
public class JobSeeker extends Person{
	@GeneratedValue
	@Column(name="job_seeker_id")
	private int jobseekerId;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="password")
	private String password;
	
	@Column(name="department_name")
	private String departmentName;
	
	
	@OneToMany(mappedBy="jobSeeker")
	private List<JobExperience> jobExperiences;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<EducationalBackground> educationalBackgrounds;
	
	@ManyToMany(mappedBy="jobSeekers")
	private List<Skill> jobSeekerSkills;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<PersonalWebPage> personalWebPages;
	
	@ManyToMany(mappedBy="jobSeekers")
	private List<Language> languages;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<CoverLetter> coverLetters;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<Image> images;
	
	@OneToOne(mappedBy="jobSeeker")
	private JobSeekerCv jobSeekerCv;
	


}
