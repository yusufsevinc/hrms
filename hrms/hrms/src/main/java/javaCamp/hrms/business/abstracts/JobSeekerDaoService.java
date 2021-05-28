package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.JobSeeker;

public interface JobSeekerDaoService {
	
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);

}
