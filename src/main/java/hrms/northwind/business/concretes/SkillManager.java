package hrms.northwind.business.concretes;

import java.util.List;

import hrms.northwind.business.abstracts.SkillService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.SkillDao;
import hrms.northwind.entities.concretes.Skill;

public class SkillManager implements SkillService{
	private SkillDao skillDao;

	public SkillManager(SkillDao skillDao) {
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Skill is added.");
	}

	@Override
	public Result addAll(List<Skill> skills) {
		this.skillDao.saveAll(skills);
		return new SuccessResult("Skills are added.");
	}

	@Override
	public DataResult getAll() {
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll(),"Skills are added.");
	}

}
