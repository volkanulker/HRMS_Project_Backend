package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.PersonService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.PersonDao;
import hrms.northwind.entities.concretes.Person;

@Service
public class PersonManager implements PersonService{
	
	private PersonDao personDao;
	@Autowired
	public PersonManager(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public DataResult<List<Person>> getAll() {
		
		return new SuccessDataResult<List<Person>>(this.personDao.findAll(),"Persons are listed successfully.");
				
	}

	@Override
	public Result add(Person person) {
		//TODO:Take name, surname, nationality_id, birthdate, email, password, password again. 
		//TODO:Check if already added to the system
		//TODO:Add mernis validation
		//TODO:return a message if person is not valid
		//TODO:If email or nationality_id is already added registration is failed and a message is returned.
		//TODO:Mail validation is requirement!
		this.personDao.save(person);
		return new SuccessResult("Person is added.");
	}

}
