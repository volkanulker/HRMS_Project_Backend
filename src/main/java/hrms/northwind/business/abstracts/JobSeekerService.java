package hrms.northwind.business.abstracts;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobSeeker;

@Service
public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	
	JobSeeker getByJobSeekerId(int id);
	

}
