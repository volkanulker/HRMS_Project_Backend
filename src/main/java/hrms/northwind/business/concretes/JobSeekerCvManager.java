package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobSeekerCvService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.JobSeekerCvDao;
import hrms.northwind.entities.concretes.JobSeekerCv;



@Service
public class JobSeekerCvManager implements JobSeekerCvService{
	private JobSeekerCvDao jobSeekerCvDao;

	
	@Autowired
	public JobSeekerCvManager(JobSeekerCvDao jobSeekerCvDao) {
		this.jobSeekerCvDao = jobSeekerCvDao;
	}

	@Override
	public DataResult<List<JobSeekerCv>> getAll() {
		return new SuccessDataResult<List<JobSeekerCv>>(this.jobSeekerCvDao.findAll(),"Jobs are listed.");
	}

	@Override
	public Result add(JobSeekerCv jobSeekerCv) {
		this.jobSeekerCvDao.save(jobSeekerCv);
		return new SuccessResult("CV is added.");
	}

	@Override
	public JobSeekerCv getByJobSeeker_jobseekerId(int id) {
		
		return this.jobSeekerCvDao.getByJobSeeker_jobseekerId(id);
	}







}
