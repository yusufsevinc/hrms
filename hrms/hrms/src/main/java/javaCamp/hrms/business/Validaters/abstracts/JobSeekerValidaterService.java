package javaCamp.hrms.business.Validaters.abstracts;

import javaCamp.hrms.dataAccess.abstracts.JobSeekerDao;
import javaCamp.hrms.entitiy.concretes.JobSeeker;

public interface JobSeekerValidaterService {
	
	
	boolean checkPassword(JobSeeker jobSeeker);
	boolean checkTcNo(JobSeeker jobSeeker);
	boolean checkFiled(JobSeeker jobSeeker);
	boolean checkEmail(JobSeeker jobSeeker , JobSeekerDao  jobSeekerDao);
	
	

}
