package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Skill;

public interface SkillDaoService {
	
	Result add(Skill skill);
	
	DataResult<List<Skill>> getAll();
}
