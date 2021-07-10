package hrms.northwind.dataAccess.abstracts;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao  extends JpaRepository <JobAdvertisement,Integer>{
	List<JobAdvertisement> getByCity_CityName(String cityName);
	
	List<JobAdvertisement> getByCreationDate(String cityName);
	
	List<JobAdvertisement> getByEmployer_CompanyNameAndIsActive(String cityName,boolean isActive);
	
	List<JobAdvertisement> getByIsActive(boolean isActive);
	
	@Transactional
    @Modifying
    @Query("UPDATE JobAdvertisement j SET j.isActive=:isActive WHERE j.id=:id")
    Result setIsActive( Boolean isActive,  int id);
	

	
}
