package hrms.northwind.business.abstracts;

import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.CoverLetter;

public interface CoverLetterService {
	Result add(CoverLetter coverLetter);

}
