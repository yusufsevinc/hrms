package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvLanguage;

public interface CvLanguageDaoService {
	
	Result add(CvLanguage cvLanguage);
	
	DataResult<List<CvLanguage>> getAll();
	

}
