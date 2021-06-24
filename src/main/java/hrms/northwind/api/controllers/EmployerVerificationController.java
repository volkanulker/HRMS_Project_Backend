package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.EmployerVerificationService;
import hrms.northwind.entities.concretes.EmployerVerification;

@RestController
@RequestMapping("/api/employerverifications")
public class EmployerVerificationController {
	private EmployerVerificationService employerVerificationService;
	
	@Autowired
	public EmployerVerificationController(EmployerVerificationService employerVerificationService) {
		this.employerVerificationService = employerVerificationService;
	}
	
	@GetMapping("/getall")
	public List<EmployerVerification> getAll(){
		return  this.employerVerificationService.getAll();
	}
	
	
}
