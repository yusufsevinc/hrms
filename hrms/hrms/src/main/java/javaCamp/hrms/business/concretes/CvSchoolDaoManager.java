package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.CvSchoolDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.CvSchoolDao;
import javaCamp.hrms.entitiy.concretes.CvSchool;

@Service
public class CvSchoolDaoManager implements CvSchoolDaoService {
	
	private CvSchoolDao cvSchoolDao;
	
	@Autowired
	public CvSchoolDaoManager(CvSchoolDao cvSchoolDao) {
		super();
		this.cvSchoolDao = cvSchoolDao;
	}
	
	@Override
	public Result add(CvSchool cvSchool) {
		this.cvSchoolDao.save(cvSchool);
		return new SuccesResult("cv ye okul eklendi..");
	}

	

	@Override
	public DataResult<List<CvSchool>> getAll() {
		return new SuccesDataResult<>(this.cvSchoolDao.findAll() , "Okullar listelendi.");
	}

	

	@Override
	public DataResult<List<CvSchool>> getCvSchoolOrderByEndDateDesc(int id) {
		
		return new SuccesDataResult<List<CvSchool>>(this.cvSchoolDao.getCvSchoolOrderByEndDateDesc(id));
		
	}
	
	
		
	

}
