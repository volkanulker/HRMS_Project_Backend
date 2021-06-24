package hrms.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.northwind.entities.concretes.Verification;

@Service
public interface VerificationService {
	List<Verification> getAll();
}
