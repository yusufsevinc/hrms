package javaCampDay6.hrms.business.abstracts;

import java.util.List;

import javaCampDay6.hrms.entitiy.concretes.JobPosition;



public interface IJobPositionService {
	List<JobPosition> getAll();
}
