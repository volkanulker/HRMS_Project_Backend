package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;
import hrms.northwind.entities.concretes.EmployerVerification;

@Service
public interface EmployerVerificationService {
	List<EmployerVerification> getAll();

	

}
