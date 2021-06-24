package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.CityService;
import hrms.northwind.dataAccess.abstracts.CityDao;
import hrms.northwind.entities.concretes.City;

@Service
public class CityManager implements CityService {
	private CityDao cityDao;
	
	
	@Autowired
	public CityManager(CityDao cityDao) {
		this.cityDao = cityDao;
	}



	@Override
	public List<City> getAll() {
		
		return this.cityDao.findAll();
	}

}
