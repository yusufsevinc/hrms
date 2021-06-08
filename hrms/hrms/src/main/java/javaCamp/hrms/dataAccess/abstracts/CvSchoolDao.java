package javaCamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvSchool;




public interface CvSchoolDao extends JpaRepository<CvSchool, Integer>{
	
	

	
	
	@Query("From CvSchool cd where cv_id =:id order by endDate  desc")
	List<CvSchool> getCvSchoolOrderByEndDateDesc(int id);
}
