package javaCamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvPrewriting;

public interface CvPrewritingDao extends JpaRepository<CvPrewriting, Integer>{
	
	
	
}
