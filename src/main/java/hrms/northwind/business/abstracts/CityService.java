package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.City;

@Service
public interface CityService {
	List<City> getAll();
}
