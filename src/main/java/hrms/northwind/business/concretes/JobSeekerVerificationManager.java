package hrms.northwind.business.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobSeekerVerificationService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.ErrorResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.JobSeekerVerificationDao;
import hrms.northwind.emailConfirmer.EmailConfirmerService;
import hrms.northwind.entities.concretes.JobSeekerVerification;

@Service
public class JobSeekerVerificationManager implements JobSeekerVerificationService {
	private JobSeekerVerificationDao jobSeekerVerificationDao;


	
	@Autowired
	public JobSeekerVerificationManager(JobSeekerVerificationDao jobSeekerVerificationDao) {
		this.jobSeekerVerificationDao = jobSeekerVerificationDao;
		
	}

	@Override
	public DataResult<List<JobSeekerVerification>> getAll() {
		return new SuccessDataResult<List<JobSeekerVerification>>(this.jobSeekerVerificationDao.findAll(),"Jobseeker Verifications are listed.");
				
	}




}
