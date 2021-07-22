package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobExperienceService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.JobExperienceDao;
import hrms.northwind.entities.concretes.JobExperience;


@Service
public class JobExperienceManager implements JobExperienceService{
	private JobExperienceDao jobExperienceDao;
	
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Job Experience is added.");
	}

	@Override
	public Result addAll(List<JobExperience> jobExperiences) {
		this.jobExperienceDao.saveAll(jobExperiences);
		return new SuccessResult("Job experiences are added.");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"Job experiences are listed.");
	}


	@Override
	public DataResult<List<JobExperience>> getByJobSeeker_jobseekerIdOrderByLeavingDateDesc(int jobSeekerId) {
		
		Sort sort = Sort.by(Sort.Direction.DESC,"yearOfExperience");
		List<JobExperience> jobExperiences = this.jobExperienceDao.findAll(sort);
		return new SuccessDataResult<List<JobExperience>>(jobExperiences,"Job experiences sorted by year of experiences.");
	}

}
