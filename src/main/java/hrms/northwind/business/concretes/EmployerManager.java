package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.EmployerService;
import hrms.northwind.dataAccess.abstracts.EmployerDao;
import hrms.northwind.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		
		return this.employerDao.findAll();
	}

}
