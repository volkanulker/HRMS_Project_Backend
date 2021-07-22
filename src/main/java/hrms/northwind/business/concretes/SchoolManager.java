package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.SchoolService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.SchoolDao;
import hrms.northwind.entities.concretes.School;


@Service
public class SchoolManager implements SchoolService{
	private SchoolDao schoolDao;
	
	
	
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("School is added.");
	}

	@Override
	public DataResult getAll() {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Schools are listed.");
	}

}
