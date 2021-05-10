package javaCampDay6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCampDay6.hrms.business.abstracts.IJobPositionService;
import javaCampDay6.hrms.dataAccess.abstracts.JobPositionDao;
import javaCampDay6.hrms.entitiy.concretes.JobPosition;


@Service
public class JobPositionManager implements IJobPositionService{

	private JobPositionDao jobPositionDao;
	
	
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao ;
	}




	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return jobPositionDao.findAll();
	}





}
