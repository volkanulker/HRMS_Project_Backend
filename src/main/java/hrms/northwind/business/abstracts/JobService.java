package hrms.northwind.business.abstracts;

import java.util.List;


import org.springframework.stereotype.Service;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.Job;

@Service
public interface JobService {
	 DataResult <List<Job>> getAll();
	 Result add(Job job);

}
