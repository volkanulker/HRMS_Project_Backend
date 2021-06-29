package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.JobDao;
import hrms.northwind.entities.concretes.Job;




@Service
public class JobManager implements JobService {
	
	private JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		this.jobDao = jobDao;
	}



	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Jobs are listed.");
				
	}


	@Override
	public Result add(Job job) {
		//TODO: If job is already added, user is informed.
		this.jobDao.save(job);
		return new SuccessResult("Job is added.");
	}

}
