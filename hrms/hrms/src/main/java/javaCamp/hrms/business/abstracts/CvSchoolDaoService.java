package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvSchool;

public interface CvSchoolDaoService {
	
	Result add(CvSchool cvSchool);
	
	DataResult<List<CvSchool>> getAll();

	
	
	DataResult<List<CvSchool>>	getCvSchoolOrderByEndDateDesc(int id);
}
