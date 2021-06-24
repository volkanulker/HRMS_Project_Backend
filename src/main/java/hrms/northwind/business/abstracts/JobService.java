package hrms.northwind.business.abstracts;

import java.util.List;


import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.Job;

@Service
public interface JobService {
	public List<Job> getAll();

}
