package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.CvLanguageDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.CvLanguageDao;
import javaCamp.hrms.entitiy.concretes.CvLanguage;

@Service
public class CvLanguageDaoManager implements CvLanguageDaoService{
	
	private CvLanguageDao cvLanguageDao;
	
	@Autowired
	public CvLanguageDaoManager(CvLanguageDao cvLanguageDao) {
		super();
		this.cvLanguageDao = cvLanguageDao;
	}
	
	@Override
	public Result add( CvLanguage cvLanguage) {
		this.cvLanguageDao.save(cvLanguage);
		return new SuccesResult("Dil cv ye eklendi");
	}

	

	@Override
	public DataResult<List<CvLanguage>> getAll() {
		
		return new  SuccesDataResult(this.cvLanguageDao.findAll(),"Adayın dilleri listeledndi.");
	}
	
	
	
}
