package hrms.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.SchoolService;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {
	private SchoolService schoolService;

	@Autowired
	public SchoolController(SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	
	

}

