package hrms.northwind.business.abstracts;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.SchoolDepartment;

public interface SchoolDepartmentService {
	Result add(SchoolDepartment schoolDepartment);
	
	DataResult getAll();
}
