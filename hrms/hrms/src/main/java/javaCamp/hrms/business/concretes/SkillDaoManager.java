package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javaCamp.hrms.business.abstracts.SkillDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.SkillDao;
import javaCamp.hrms.entitiy.concretes.Skill;

@Service
public class SkillDaoManager implements SkillDaoService{

	private SkillDao skillDao;
	
	@Autowired
	public SkillDaoManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	
	@Override
	public Result add( Skill skill) {
		this.skillDao.save(skill);
		return new SuccesResult("Yetenek eklendi.");
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccesDataResult<List<Skill>>(this.skillDao.findAll() , "Yetenekler Listelendi...");
	}
	
	

}
