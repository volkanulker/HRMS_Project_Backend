package hrms.northwind.business.abstracts;

import java.util.List;
import org.springframework.stereotype.Service;
import hrms.northwind.entities.concretes.SystemPersonal;

@Service
public interface SystemPersonalService {
		List<SystemPersonal> getAll();
	
}
