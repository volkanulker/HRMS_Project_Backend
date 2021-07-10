package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.entities.concretes.JobAdvertisement;

@Service
public interface JobAdvertisementService {
	List<JobAdvertisement> getAll();
	
	DataResult<List<JobAdvertisement>> getByCity_CityName(String cityName);
}
