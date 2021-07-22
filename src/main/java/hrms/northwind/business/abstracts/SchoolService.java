package hrms.northwind.business.abstracts;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.School;

public interface SchoolService {
	Result add(School school);
	
	
	DataResult<School> getAll();
}
