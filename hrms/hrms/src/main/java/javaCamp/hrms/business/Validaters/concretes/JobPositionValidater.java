package javaCamp.hrms.business.Validaters.concretes;


import org.springframework.stereotype.Service;

import javaCamp.hrms.business.Validaters.abstracts.JobPositionValidaterService;
import javaCamp.hrms.dataAccess.abstracts.JobPositionDao;
import javaCamp.hrms.entitiy.concretes.JobPosition;

@Service
public class JobPositionValidater implements JobPositionValidaterService  {
	
	

	@Override
	public boolean checkName(JobPosition jobPosition ,JobPositionDao jobPositionDao){
			if(jobPositionDao.getByName(jobPosition.getName()) == null){
				
				return true;
		}
		
			return false;
		}

	
	


	


}
