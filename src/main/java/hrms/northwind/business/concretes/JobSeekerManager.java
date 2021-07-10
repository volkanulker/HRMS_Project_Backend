package hrms.northwind.business.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobSeekerService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.ErrorResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.JobSeekerDao;
import hrms.northwind.emailConfirmer.EmailConfirmerService;
import hrms.northwind.entities.concretes.JobSeeker;
import hrms.northwind.entities.concretes.Person;
import hrms.northwind.mernis.MernisManager;
import hrms.northwind.mernis.MernisService;

@Service
public class JobSeekerManager implements JobSeekerService, MernisService,EmailConfirmerService{
	private JobSeekerDao jobSeekerDao;
	private MernisService mernisService;
	private EmailConfirmerService emailConfirmerService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}
	

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"JobSeekers are listed.");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		//TODO:Take name, surname, nationality_id, birthdate, email, password, password again. 
		//TODO:Check if already added to the system
		//TODO:Add mernis validation
		//TODO:return a message if person is not valid
		//TODO:If email or nationality_id is already added registration is failed and a message is returned.
		//TODO:Mail validation is requirement!
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("New Job seeker is added.");
	}
	
	

	public Result isJobSeekerValid(JobSeeker jobSeeker,String repeatedPassword) {
		String name=jobSeeker.getName();
		String surname=jobSeeker.getSurname(); 
		String ssn = jobSeeker.getSsn();
		Date birth_date = jobSeeker.getBirthDate();
		String email = jobSeeker.getEmail();
		String password = jobSeeker.getPassword();
		
		Result isAnyFieldEmptyResult =isAnyFieldEmpty(name, surname, ssn, birth_date, email, password, repeatedPassword);
		Result isUserAlreadyAddedResult = isJobSeekerAlreadyAdded(ssn,email);
		Result isEmailConfirmedResult = isEmailConfirmed(email);
		if(!isAnyFieldEmptyResult.isSuccess() || !isUserAlreadyAddedResult.isSuccess() || !isPersonValid(jobSeeker)  ||!isEmailConfirmedResult.isSuccess()) {
			return new ErrorResult("Job seeker is not valid.");
		} else {
			return new SuccessResult("Job seeker is valid.");
		}
	}


	public Result isAnyFieldEmpty(String name, String surname, String ssn, Date birth_date, String email,
			String password, String repeatedPassword) {
		
		if(name.isEmpty()||surname.isEmpty()||ssn.isEmpty()|| birth_date.toString().isEmpty() || email.isEmpty() || password.isEmpty() 
				|| repeatedPassword.isEmpty()) 
			return new ErrorResult("Fields can not be empty.");
		 else 
			return new SuccessResult("All fields are filled.");
	}

	//TODO: USE GET BY FOR SEARCHING
	public Result isJobSeekerAlreadyAdded(String ssn, String email) {
		List<JobSeeker> jobSeekers = this.jobSeekerDao.findAll();
		
		for(JobSeeker jobSeeker : jobSeekers) {
			if(jobSeeker.getEmail().equals(email) || jobSeeker.getSsn().equals(ssn))
				return new ErrorResult("JobSeeker is already added.");
		}
		return new SuccessResult("JobSeeker is not added before.");
	}


	@Override
	public boolean isPersonValid(Person person) {
		return mernisService.isPersonValid(person);
		
	}


	@Override
	public void sendConfirmation(String email, String message, String confirmationCode) {
		this.emailConfirmerService.sendConfirmation(email, message, confirmationCode);
		
	}


	@Override
	public Result isEmailConfirmed(String email) {
		return emailConfirmerService.isEmailConfirmed(email);
	}

	
}
