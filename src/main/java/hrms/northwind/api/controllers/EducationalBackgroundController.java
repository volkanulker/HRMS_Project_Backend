package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.EducationalBackgroundService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.EducationalBackground;

@RestController
@RequestMapping("/api/EducationalBackgrounds")
public class EducationalBackgroundController {
	private EducationalBackgroundService educationalBackgroundService;

	@Autowired
	public EducationalBackgroundController(EducationalBackgroundService educationalBackgroundService) {
		this.educationalBackgroundService = educationalBackgroundService;
	}
	
	@PostMapping("/add")
	Result add(EducationalBackground educationaBackground) {
		return this.educationalBackgroundService.add(educationaBackground);
	}
	
	@GetMapping("/getAll")
	DataResult<List<EducationalBackground>> getAll(){
		return this.educationalBackgroundService.getAll();
	}
	
	@GetMapping("/getAllByOrderByLeavingDate")
	DataResult<List<EducationalBackground>> getAllByJobSeeker_JobSeekerIdOrderBySchoolGraduationDate(int candidateId){
		return this.educationalBackgroundService.getAllByJobSeeker_jobseekerIdOrderBySchoolGraduationDate(candidateId);
	}
	
	
	

}
