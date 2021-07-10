package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.EmployerService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.ErrorResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.EmployerDao;
import hrms.northwind.emailConfirmer.EmailConfirmerService;
import hrms.northwind.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService, EmailConfirmerService{
	private EmployerDao employerDao;
	private EmailConfirmerService emailConfirmerService;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employers are listed.");
	}

	@Override
	public Result add(Employer employer) {
		// TODO: Take company_name, website, email that has the same domain with website, phone_number, password, 
		//  password again from user
		//TODO:All fields are required, user must be informed
		//TODO:Verificate company with email 
		//TODO:If email is already added, operation fails and employer is informed.
		this.employerDao.save(employer);
		return new SuccessResult("New employer is added.");
	}
	
	public Result isEmployerValid(Employer employer,String repeatedPassword) {
		String companyName = employer.getCompany_name(); 
		String website = employer.getWebsite();
		String email = employer.getEmail();
		String phone = employer.getPhone_number();
		String password = employer.getPassword();
		
		Result isEmployerAlreadyAddedResult = isEmployerAlreadyAdded(employer);
		Result isAnyFieldEmptyResult = isAnyFieldEmpty(companyName,website,email,phone,password,repeatedPassword);
		Result isEmailConfirmed = isEmailConfirmed(email);
		if(!isEmployerAlreadyAddedResult.isSuccess() || !isAnyFieldEmptyResult.isSuccess() || !isEmailConfirmed.isSuccess()) 
			return new ErrorResult("Employer is not valid.");
		 else 
			return new SuccessResult("Employer is added successfully.");
		
	}
	
	public Result isAnyFieldEmpty(String companyName, String website, String email, String phone, String password, String repeatedPassword) {
		if(companyName.isEmpty() || website.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() || repeatedPassword.isEmpty())
			return new ErrorResult("One of field is empty.");
		else 
			return new SuccessResult("All fields are filled");
	}
	
	//TODO: USE GET BY FOR SEARCHING
	public Result isEmployerAlreadyAdded(Employer employer) {
		List<Employer> addedEmployers = this.employerDao.findAll();
		String searchedEmail = employer.getEmail();
		String tempEmployerEmail;
		for(Employer addedEmployer : addedEmployers) {
			tempEmployerEmail = addedEmployer.getEmail();
			if(tempEmployerEmail.equals(searchedEmail))
				return new ErrorResult("Employer is already added.");
		}
		
		return new SuccessResult("Employer is not added before.");
		
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
