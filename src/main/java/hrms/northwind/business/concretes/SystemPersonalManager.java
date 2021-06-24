package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.SystemPersonalService;
import hrms.northwind.dataAccess.abstracts.SystemPersonalDao;
import hrms.northwind.entities.concretes.SystemPersonal;

@Service
public class SystemPersonalManager implements SystemPersonalService {
	private SystemPersonalDao systemPersonalDao;
	
	public SystemPersonalManager(SystemPersonalDao systemPersonalDao) {
		this.systemPersonalDao = systemPersonalDao;
	}

	@Override
	public List<SystemPersonal> getAll() {
		return this.systemPersonalDao.findAll();
	}

}
