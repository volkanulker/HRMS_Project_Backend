package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.JobAdvertisementService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.JobAdvertisementDao;
import hrms.northwind.entities.concretes.JobAdvertisement;



@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public List<JobAdvertisement> getAll() {
		return this.jobAdvertisementDao.findAll();
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByCity_CityName(String cityName) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByCity_CityName(cityName),"Data is fetched according to city Name");
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC,"creationDate");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort),"Successfully sorted.");
	}
	
	 @Override
	 public DataResult<List<JobAdvertisement>> getAllIsActiveTrue() {
		 Sort sort = Sort.by(Sort.Direction.ASC,"creationDate");
	     return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), " Aktif Datalar Listelendi");
	 }

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer_CompanyNameAndIsActive(String employerName,boolean isActive) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployer_CompanyNameAndIsActive(employerName,isActive));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActive(isActive));
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job Advertisement is added.");
	}

	@Override
	public Result setIsActiveFalse(int id) {
		this.jobAdvertisementDao.setIsActive(false, id);
		return new SuccessResult("Job advertisement is listed.");
	}

	@Override
	public Result setIsActiveTrue(int id) {
		this.jobAdvertisementDao.setIsActive(true, id);
		return new SuccessResult("Job advertisement is deleted.");
	}
	



}
