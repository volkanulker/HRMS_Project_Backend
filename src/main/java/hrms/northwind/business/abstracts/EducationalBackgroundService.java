package hrms.northwind.business.abstracts;

import java.util.List;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.EducationalBackground;

public interface EducationalBackgroundService {
	Result add(EducationalBackground educationaBackground);
	DataResult<List<EducationalBackground>> getAll();
	DataResult<List<EducationalBackground>> getAllByJobSeeker_jobseekerIdOrderBySchoolGraduationDate(int candidateId);

}
