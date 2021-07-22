package hrms.northwind.business.abstracts;

import java.util.List;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.Language;

public interface LanguageService {
	Result add(Language language);
	
	Result addAll(List<Language> languages);
	
	DataResult<List<Language>> getAll();

}
