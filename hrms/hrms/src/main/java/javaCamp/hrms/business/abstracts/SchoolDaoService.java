package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.School;

public interface SchoolDaoService {
	
	Result add(School school);
	
	DataResult<List<School>> getAll();
	
	

}
