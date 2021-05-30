package javaCamp.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.entitiy.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
	JobPosition getByName(String name);

}
