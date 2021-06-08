package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.CvExperienceDaoService;
import javaCamp.hrms.business.abstracts.CvPrewritingDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.CvPrewritingDao;
import javaCamp.hrms.entitiy.concretes.CvExperience;
import javaCamp.hrms.entitiy.concretes.CvPrewriting;
@Service
public class CvPrewritingDaoManager implements CvPrewritingDaoService{

	private CvPrewritingDao cvPrewritingDao;
	
	@Autowired
	public CvPrewritingDaoManager(CvPrewritingDao cvPrewritingDao) {
		super();
		this.cvPrewritingDao = cvPrewritingDao;
	}

	
	@Override
	public Result add(CvPrewriting cvPrewriting) {
		this.cvPrewritingDao.save(cvPrewriting);
		return new SuccesResult("ön yazı eklendi");
	}

	@Override
	public DataResult<List<CvPrewriting>> getAll() {
		return new SuccesDataResult<List<CvPrewriting>>(this.cvPrewritingDao.findAll(),
				"önyazılar listelendi");
		
	}

	

}
