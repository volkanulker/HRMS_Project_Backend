package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.VerificationService;
import hrms.northwind.dataAccess.abstracts.VerificationDao;
import hrms.northwind.entities.concretes.Verification;

@Service
public class VerificationManager implements VerificationService{
	private VerificationDao verificationDao;
	
	@Autowired
	public VerificationManager(VerificationDao verificationDao) {
		this.verificationDao = verificationDao;
	}
	
	@Override
	public List<Verification> getAll(){
		return this.verificationDao.findAll();
	}
	
	
	
	
	
}
