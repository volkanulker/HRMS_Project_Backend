package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.JobAdvertisementService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobAdvertisement;


@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public List<JobAdvertisement> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getAllSortedByDate")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return this.jobAdvertisementService.getAllSorted();
	}
	
	@GetMapping("/getAllIsActiveTrue")
    public DataResult<List<JobAdvertisement>> getAllIsActiveTrue(){
        return this.jobAdvertisementService.getAllIsActiveTrue();
    }
	
	@GetMapping("/getByCityName")
	public DataResult<List<JobAdvertisement>> getByCityName(@RequestParam String cityName){
		return this.jobAdvertisementService.getByCity_CityName(cityName);
	}

	
	@GetMapping("/getByEmployerNameAndIsActive")
	public DataResult<List<JobAdvertisement>> getByEmployer_CompanyNameAndIsActive(@RequestParam String employerName,@RequestParam boolean isActive){
		return this.jobAdvertisementService.getByEmployer_CompanyNameAndIsActive(employerName,isActive);
		
	}
	
	@GetMapping("/getByIsActive")
	public DataResult<List<JobAdvertisement>> getByIsActive(@RequestParam boolean isActive){
		return this.jobAdvertisementService.getByIsActive(isActive);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdversitement) {
		return this.jobAdvertisementService.add(jobAdversitement);
	}
	
	
	@PostMapping( "/setIsActiveFalse")
    public Result setIsactiveFalse(int id){
        return this.jobAdvertisementService.setIsActiveFalse(id);
    }

    @PostMapping( "/setIsActiveTrue")
    public Result setIsactiveTrue(int id){
        return this.jobAdvertisementService.setIsActiveTrue(id);
    }
	
	
	

}
