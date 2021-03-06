package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Employer;



public interface EmployerDaoService {
	DataResult<List<Employer>> getAll();
	Result  add(Employer employer);
	
	
}
