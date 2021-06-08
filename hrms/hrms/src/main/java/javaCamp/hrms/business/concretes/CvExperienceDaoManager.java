package javaCamp.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javaCamp.hrms.business.abstracts.CvExperienceDaoService;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.CvExperienceDao;
import javaCamp.hrms.entitiy.concretes.CvExperience;
@Service
public class CvExperienceDaoManager implements CvExperienceDaoService{
	
	private CvExperienceDao cvExperienceDao;

	@Autowired
	public CvExperienceDaoManager(CvExperienceDao cvExperienceDao) {
		super();
		this.cvExperienceDao = cvExperienceDao;
	}


	@Override
	public Result add( CvExperience cvExperience) {
		this.cvExperienceDao.save(cvExperience);
		return new SuccesResult("cv ye experience eklendi...");
	}
	

}
