package javaCamp.hrms.business.Validaters.abstracts;

import java.util.List;

import javaCamp.hrms.dataAccess.abstracts.JobPositionDao;
import javaCamp.hrms.entitiy.concretes.JobPosition;

public interface JobPositionValidaterService {
	boolean checkName(JobPosition jobPosition ,JobPositionDao jobPositionDao);
	
}
