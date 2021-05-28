package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.Validaters.abstracts.JobPositionValidaterService;
import javaCamp.hrms.business.abstracts.JobPositionDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.ErrorResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.JobPositionDao;
import javaCamp.hrms.entitiy.concretes.JobPosition;
@Service
public class JobPositionDaoManager implements JobPositionDaoService {
	
	private JobPositionDao jobPositionDao;
	private JobPositionValidaterService jobPositionValidaterService;
	
	
	
	@Autowired
	public JobPositionDaoManager(JobPositionDao jobPositionDao,JobPositionValidaterService jobPositionValidaterService) {
		super();
		this.jobPositionDao = jobPositionDao;
		this.jobPositionValidaterService = jobPositionValidaterService;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccesDataResult<>(this.jobPositionDao.findAll() , "Pozisyonlar Listelendi...");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if(jobPositionValidaterService.checkName(jobPosition, jobPositionDao)) {
			jobPositionDao.save(jobPosition);
			return new SuccesResult(jobPosition.getName() + " eklendi.");
		}else {
			return new ErrorResult("Aynı isimde bir iş pozisyonu mevcut...");

		}
	}

	

}
