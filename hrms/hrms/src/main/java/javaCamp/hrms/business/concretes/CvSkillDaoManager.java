package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.CvSkillDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.CvSkillDao;
import javaCamp.hrms.entitiy.concretes.CvSkill;

@Service
public class CvSkillDaoManager implements CvSkillDaoService{
	
	private CvSkillDao cvSkillDao;
	
	
	@Autowired
	public CvSkillDaoManager(CvSkillDao cvSkillDao) {
		super();
		this.cvSkillDao = cvSkillDao;
	}
	



	@Override
	public Result add(CvSkill cvSkill) {
		this.cvSkillDao.save(cvSkill);
		return new SuccesResult("yetenek eklendi.");
	}




	@Override
	public DataResult<List<CvSkill>> getAll() {
	
		return new SuccesDataResult<List<CvSkill>>(this.cvSkillDao.findAll() ,"cv yetenekleri listelendi.");
	}
	
	
	


	


	
	

}
