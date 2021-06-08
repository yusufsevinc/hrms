package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.CVDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.CVDao;
import javaCamp.hrms.entitiy.concretes.CV;

@Service
public class CVDaoManager implements CVDaoService {
	
	
	private CVDao cvDao;
	
	
	@Autowired
	public CVDaoManager(CVDao cvDao) {
		super();
		this.cvDao = cvDao;
	}



	@Override
	public Result add(CV cv) {
		this.cvDao.save(cv);
		return new SuccesResult("CV eklendi" );
	}



	@Override
	public DataResult<List<CV>> getAll() {
		
		return new SuccesDataResult<List<CV>>(this.cvDao.findAll(),"Data Listelendi");
	}



	@Override
	public DataResult<List<CV>> getByCvId(int cvId) {
		
		return new SuccesDataResult<List<CV>>(this.cvDao.getByCvId(cvId) ,"Data Listelendi");
	}
	
	
	

}
