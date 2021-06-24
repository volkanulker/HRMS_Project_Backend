package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.PersonService;
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
	public List<Person> getAll(){
		return this.personService.getAll();
	}
}
