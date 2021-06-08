package javaCamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.entitiy.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
	
	JobSeeker getByEmail(String eMail);
	
	 JobSeeker getById(int jobSeekerId);

}
