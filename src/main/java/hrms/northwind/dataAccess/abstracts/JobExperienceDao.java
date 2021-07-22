package hrms.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.entities.concretes.JobExperience;


public interface JobExperienceDao extends JpaRepository<JobExperience,Integer>{
	// JPQL

	List<JobExperience> getByJobSeeker_jobseekerIdOrderByLeavingDateDesc(int jobSeekerId);
}
