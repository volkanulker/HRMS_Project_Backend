package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.JobSeekerVerification;

@Service
public interface JobSeekerVerificationService {
	List<JobSeekerVerification> getAll();

}
