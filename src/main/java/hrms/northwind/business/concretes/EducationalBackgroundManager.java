package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.EducationalBackgroundService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.EducationalBackgroundDao;
import hrms.northwind.entities.concretes.EducationalBackground;


@Service
public class EducationalBackgroundManager implements EducationalBackgroundService{
	
	private EducationalBackgroundDao educationalBackgroundDao;
	
	
	@Autowired
	public EducationalBackgroundManager(EducationalBackgroundDao educationalBackgroundDao) {

		this.educationalBackgroundDao = educationalBackgroundDao;
	}

	@Override
	public Result add(EducationalBackground educationalBackground) {
		this.educationalBackgroundDao.save(educationalBackground);
		
		return new SuccessResult("Educational Background successfully added.");
		
	}

	@Override
	public DataResult<List<EducationalBackground>> getAll() {
		return new SuccessDataResult<List<EducationalBackground>>(this.educationalBackgroundDao.findAll(),"Educational backgrounds are listed.");
	}

	@Override
	public DataResult<List<EducationalBackground>> getAllByJobSeeker_jobseekerIdOrderBySchoolGraduationDate(int jobSeekerId) {
		
		return new SuccessDataResult<List<EducationalBackground>>(this.educationalBackgroundDao.getAllByJobSeeker_jobseekerIdOrderBySchoolGraduationDate(jobSeekerId),"successfully listed.");
	}

}
