package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.JobPosition;

public interface JobPositionDaoService{
	
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	
}
