package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.VerificationService;
import hrms.northwind.entities.concretes.Verification;

@RestController
@RequestMapping("/api/verifications")
public class VerificationController {
	private VerificationService verificationService;
	
	@Autowired
	public VerificationController(VerificationService verificationService) {
		this.verificationService = verificationService;
	}
	
	public List<Verification> getAll(){
		return this.verificationService.getAll();
		
	}
	
	
}
