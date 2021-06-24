package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobService;
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
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

}
