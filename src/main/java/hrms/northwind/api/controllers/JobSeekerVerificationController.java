package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.JobSeekerVerificationService;
import hrms.northwind.entities.concretes.JobSeekerVerification;

@RestController
@RequestMapping("/api/jobseekerverifications")
public class JobSeekerVerificationController {
	private JobSeekerVerificationService jobSeekerVerificationService;
	@Autowired
	public JobSeekerVerificationController(JobSeekerVerificationService jobSeekerVerificationService) {
		this.jobSeekerVerificationService = jobSeekerVerificationService;
	}
	
	@GetMapping("/getall")
	public List<JobSeekerVerification> getAll(){
		return this.jobSeekerVerificationService.getAll();
	}
	
	

}
