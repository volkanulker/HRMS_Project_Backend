package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.JobExperienceService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobexperiences")
public class JobExperienceController {
	private JobExperienceService jobExperienceService;

	
	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		this.jobExperienceService = jobExperienceService;
	}
	
	@GetMapping("/getAll")
	DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	
	
	@GetMapping("/getByJobSeeker_jobseekerIdOrderByLeavingDateDesc")
	DataResult<List<JobExperience>> getByOrderByYearOfExperienceDesc(int jobSeekerId){
		return this.jobExperienceService.getByJobSeeker_jobseekerIdOrderByLeavingDateDesc(jobSeekerId);
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobExperience jobExperience){
		return this.jobExperienceService.add(jobExperience);
	}
	
	@PostMapping("/addAll")
	Result addAll(List<JobExperience> jobExperiences) {
		return this.jobExperienceService.addAll(jobExperiences);
	}
	
	
	
	

}


//@RestController
//@RequestMapping("/api/employers")
//public class EmployerController {
//	private EmployerService employerService;
//	
//	@Autowired
//	public EmployerController(EmployerService employerService) {
//		this.employerService = employerService;
//	}
//	
//	@GetMapping("/getall")
//	public DataResult<List<Employer>> getAll(){
//		return this.employerService.getAll();
//	}
//	
//	@PostMapping("/add")
//	public Result add(Employer employer){
//		return this.employerService.add(employer);
//	}
//	
//
//}