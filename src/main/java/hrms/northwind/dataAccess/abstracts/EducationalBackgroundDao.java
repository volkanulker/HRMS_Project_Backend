package hrms.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.EducationalBackground;

public interface EducationalBackgroundDao extends JpaRepository<EducationalBackground,Integer>{
	
	List<EducationalBackground> getAllByJobSeeker_jobseekerIdOrderBySchoolGraduationDate(int jobSeekerId);
}
