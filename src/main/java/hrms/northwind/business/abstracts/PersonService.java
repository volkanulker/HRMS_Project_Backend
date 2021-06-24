package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.Person;
@Service
public interface PersonService {
	List<Person> getAll();
}
