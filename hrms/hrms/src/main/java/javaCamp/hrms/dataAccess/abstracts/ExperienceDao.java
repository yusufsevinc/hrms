package javaCamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer>{
	


}
