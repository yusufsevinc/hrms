package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvSkill;

public interface CvSkillDaoService {
	
	Result add(CvSkill cvSkill);
	
	DataResult<List<CvSkill>> getAll();

}
