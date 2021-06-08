package javaCamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CV;


public interface CVDao extends JpaRepository<CV, Integer> {
	
	List<CV> getByCvId(int cvId);
	
	
}
