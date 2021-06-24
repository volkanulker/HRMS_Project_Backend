package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.PersonService;
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
	public List<Person> getAll() {
		
		return this.personDao.findAll();
	}

}
