package javaCampDay6.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCampDay6.hrms.entitiy.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
