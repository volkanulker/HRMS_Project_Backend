package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.JobAdvertisement;

@Service
public interface JobAdvertisementService {
	List<JobAdvertisement> getAll();
}
