package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.Employer;

@Service
public interface EmployerService {
	List<Employer> getAll();

}
