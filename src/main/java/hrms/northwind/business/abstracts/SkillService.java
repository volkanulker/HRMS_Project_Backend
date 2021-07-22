package hrms.northwind.business.abstracts;

import java.util.List;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.Skill;

public interface SkillService {
	Result add(Skill skill);
	
	Result addAll(List<Skill> skills);
	
	DataResult getAll();
}
