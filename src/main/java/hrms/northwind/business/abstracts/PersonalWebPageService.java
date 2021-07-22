package hrms.northwind.business.abstracts;

import java.util.List;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.PersonalWebPage;

public interface PersonalWebPageService {
	Result add(PersonalWebPage personalWebPage);
	
	Result addAll(List<PersonalWebPage> personalWebPage);
	
	DataResult<List<PersonalWebPage>> getAll();

}
