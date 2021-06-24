package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.EmployerVerificationService;
import hrms.northwind.dataAccess.abstracts.EmployerVerificationDao;
import hrms.northwind.entities.concretes.EmployerVerification;

@Service
public class EmployerVerificationManager implements EmployerVerificationService {
	
	private EmployerVerificationDao employerVerificationDao;
	
	@Autowired
	public EmployerVerificationManager(EmployerVerificationDao employerVerificationDao) {
		this.employerVerificationDao = employerVerificationDao;
	}


	@Override
	public List<EmployerVerification> getAll() {
		return this.employerVerificationDao.findAll();
	}
	
}
