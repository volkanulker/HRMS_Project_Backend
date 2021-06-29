package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.Employer;

@Service
public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);

}
