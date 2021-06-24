package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.JobSeeker;

@Service
public interface JobSeekerService {
	List<JobSeeker> getAll();
}
