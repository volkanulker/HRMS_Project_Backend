package hrms.northwind.business.abstracts;

import java.util.List;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.dataAccess.abstracts.JobSeekerCvDao;
import hrms.northwind.entities.concretes.JobSeekerCv;
import hrms.northwind.entities.dtos.JobSeekerCvDto;

public interface JobSeekerCvService {
	
	DataResult<List<JobSeekerCv>> getAll();
	
	Result add(JobSeekerCv jobSeekerCv);
	
	JobSeekerCv getByJobSeeker_jobseekerId(int id);

}
