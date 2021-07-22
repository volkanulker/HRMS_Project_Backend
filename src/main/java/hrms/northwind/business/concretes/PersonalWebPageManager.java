package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.northwind.business.abstracts.PersonalWebPageService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.PersonalWebPageDao;
import hrms.northwind.entities.concretes.PersonalWebPage;

public class PersonalWebPageManager implements PersonalWebPageService{
	
	private PersonalWebPageDao personalWebPageDao;
	
	
	@Autowired
	public PersonalWebPageManager(PersonalWebPageDao personalWebPageDao) {
		this.personalWebPageDao = personalWebPageDao;
	}

	@Override
	public Result add(PersonalWebPage personalWebPage) {
		this.personalWebPageDao.save(personalWebPage);
		return new SuccessResult("Personal Web Page is added.");
	}

	@Override
	public Result addAll(List<PersonalWebPage> personalWebPages) {
		this.personalWebPageDao.saveAll(personalWebPages);
		return new SuccessResult("Personal Web Pages are added.");
	}

	@Override
	public DataResult<List<PersonalWebPage>> getAll() {
		
		return new SuccessDataResult<List<PersonalWebPage>>(this.personalWebPageDao.findAll(),"Personal Web Pages are listed.");
	}

}
