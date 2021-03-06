package hrms.northwind.business.abstracts;

import java.util.List;


import org.springframework.stereotype.Service;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.JobPosition;

@Service
public interface JobPositionService {
	 DataResult <List<JobPosition>> getAll();
	 Result add(JobPosition jobPosition);

}
