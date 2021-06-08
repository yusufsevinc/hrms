package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.SchoolDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.SchoolDao;
import javaCamp.hrms.entitiy.concretes.School;

@Service
public class SchoolDaoManager implements SchoolDaoService{

	private SchoolDao schoolDao;
	
	
	@Autowired
	public SchoolDaoManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}



	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccesResult(school + "  eklendi..");
	}



	@Override
	public DataResult<List<School>> getAll() {
		return new SuccesDataResult<List<School>>(this.schoolDao.findAll() , "Okullar Listelendi");
	}

}
