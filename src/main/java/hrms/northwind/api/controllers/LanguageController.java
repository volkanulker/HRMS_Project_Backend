package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.LanguageService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;

	
	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
		
	}
	
	
	
	@GetMapping("/getAll")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}
	

}

//@RestController // tell that you are a rest controller
//@RequestMapping("/api/persons")
//public class PersonController {
//	private PersonService personService;
//	@Autowired
//	public PersonController(PersonService personService) {
//		this.personService = personService;
//	}
//
//	@GetMapping("/getall")
//	public DataResult<List<Person>> getAll(){
//		return this.personService.getAll();
//	}
//	
//	@PostMapping("/add")
//	public Result add(@RequestBody Person person) {
//		return this.personService.add(person);
//		
//	}
//}