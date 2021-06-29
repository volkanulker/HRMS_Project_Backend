package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.PersonService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.Person;

@RestController // tell that you are a rest controller
@RequestMapping("/api/persons")
public class PersonController {
	private PersonService personService;
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/getall")
	public DataResult<List<Person>> getAll(){
		return this.personService.getAll();
	}
	
	@GetMapping("/add")
	public Result add(@RequestBody Person person) {
		return this.personService.add(person);
		
	}
}
