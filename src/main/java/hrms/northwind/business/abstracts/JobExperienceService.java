package hrms.northwind.business.abstracts;

import java.util.List;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobExperience;

public interface JobExperienceService {
	Result add(JobExperience jobExperience);
	
	Result addAll(List<JobExperience> jobExperiences);
	
	DataResult<List<JobExperience>> getAll();
	
	DataResult<List<JobExperience>> getByJobSeeker_jobseekerIdOrderByLeavingDateDesc(int jobSeekerId);
	
	

}
