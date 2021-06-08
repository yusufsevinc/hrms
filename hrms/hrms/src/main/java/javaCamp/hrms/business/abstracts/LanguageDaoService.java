package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Language;

public interface LanguageDaoService {

	Result add(Language language);
	
	DataResult<List<Language>> getAll();
}
