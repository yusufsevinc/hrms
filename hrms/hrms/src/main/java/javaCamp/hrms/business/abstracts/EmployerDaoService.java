package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.entitiy.concretes.Employer;
import javaCamp.hrms.entitiy.concretes.JobPosition;



public interface EmployerDaoService {
	DataResult<List<Employer>> getAll();
	Result  add(Employer employer);
	
}
