package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.northwind.business.abstracts.SchoolDepartmentService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.SchoolDepartmentDao;
import hrms.northwind.entities.concretes.SchoolDepartment;

public class SchoolDepartmentManager implements SchoolDepartmentService{
	
	private SchoolDepartmentDao schoolDepartmentDao;
	
	@Autowired
	public SchoolDepartmentManager(SchoolDepartmentDao schoolDepartmentDao) {
		this.schoolDepartmentDao = schoolDepartmentDao;
	}

	@Override
	public Result add(SchoolDepartment schoolDepartment) {
		this.schoolDepartmentDao.save(schoolDepartment);
		return new SuccessResult("School department is saved.");
	}

	@Override
	public DataResult getAll() {
		return new SuccessDataResult<List<SchoolDepartment>>(this.schoolDepartmentDao.findAll(),"School departments are listed.");
	}

}
