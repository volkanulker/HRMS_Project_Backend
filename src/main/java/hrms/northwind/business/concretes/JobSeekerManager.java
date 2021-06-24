package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobSeekerService;
import hrms.northwind.dataAccess.abstracts.JobSeekerDao;
import hrms.northwind.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}
	
	@Override
	public List<JobSeeker> getAll(){
		return this.jobSeekerDao.findAll();
	}

	
	
}
