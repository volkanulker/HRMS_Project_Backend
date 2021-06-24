package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.Person;

public interface PersonDao extends JpaRepository<Person,Integer>{ 

}
