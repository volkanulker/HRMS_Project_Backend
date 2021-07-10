package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobAdvertisement;


@Service
public interface JobAdvertisementService {
	List<JobAdvertisement> getAll();
	
	DataResult<List<JobAdvertisement>> getByCity_CityName(String cityName);
	
	DataResult<List<JobAdvertisement>> getAllSorted();
	
	DataResult<List<JobAdvertisement>> getByEmployer_CompanyNameAndIsActive(String companyName,boolean isActive);
	
	DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive);
	
	Result add(JobAdvertisement jobAdvertisement); 
	
	DataResult<List<JobAdvertisement>> getAllIsActiveTrue();
	
	Result setIsActiveFalse(int id);

	Result setIsActiveTrue(int id);
}
