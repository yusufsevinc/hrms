package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.LanguageDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.LanguageDao;
import javaCamp.hrms.entitiy.concretes.Language;

@Service
public class LanguageDaoManager implements LanguageDaoService {
	
	private LanguageDao languageDao;

	
	
	@Autowired
	public LanguageDaoManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}




	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccesResult(language + " dil eklendi..");
	}




	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccesDataResult(this.languageDao.findAll(),"Diller Listendi");
	}

}
