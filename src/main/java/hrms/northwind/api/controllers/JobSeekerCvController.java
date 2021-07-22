package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.JobSeekerCvService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobSeekerCv;

@RestController
@RequestMapping("/api/jobSeekerCvs")
public class JobSeekerCvController {
	
	private JobSeekerCvService jobSeekerCvService;

	
	@Autowired
	public JobSeekerCvController(JobSeekerCvService jobSeekerCvService) {
		this.jobSeekerCvService = jobSeekerCvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeekerCv>> getAll(){
		return this.jobSeekerCvService.getAll();
		
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerCv jobSeekerCv){
		return this.jobSeekerCvService.add(jobSeekerCv);
		
	}
	
	@GetMapping("/getByJobSeekerId")
	JobSeekerCv getByJobSeeker_jobseekerId(int id) {
		return this.jobSeekerCvService.getByJobSeeker_jobseekerId(id);
	}
	
	

}
