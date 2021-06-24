package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobSeekerVerificationService;
import hrms.northwind.dataAccess.abstracts.JobSeekerVerificationDao;
import hrms.northwind.entities.concretes.JobSeekerVerification;

@Service
public class JobSeekerVerificationManager implements JobSeekerVerificationService {
	private JobSeekerVerificationDao jobSeekerVerificationDao;
	
	@Autowired
	public JobSeekerVerificationManager(JobSeekerVerificationDao jobSeekerVerificationDao) {
		this.jobSeekerVerificationDao = jobSeekerVerificationDao;
	}

	@Override
	public List<JobSeekerVerification> getAll() {
		// TODO Auto-generated method stub
		return this.jobSeekerVerificationDao.findAll();
	}

}
