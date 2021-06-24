package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.SystemPersonalService;
import hrms.northwind.entities.concretes.SystemPersonal;

@RestController
@RequestMapping("/api/systempersonals")
public class SystemPersonalController {
	private SystemPersonalService systemPersonalService;
	
	@Autowired
	public SystemPersonalController(SystemPersonalService systemPersonalService) {
		this.systemPersonalService = systemPersonalService;
	}
	
	@GetMapping("/getall")
	public List<SystemPersonal> getAll() {
		return this.systemPersonalService.getAll();
	}

	
	
}
