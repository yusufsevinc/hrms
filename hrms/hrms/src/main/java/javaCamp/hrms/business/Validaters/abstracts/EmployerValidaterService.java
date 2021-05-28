package javaCamp.hrms.business.Validaters.abstracts;

import javaCamp.hrms.dataAccess.abstracts.EmployerDao;
import javaCamp.hrms.entitiy.concretes.Employer;

public interface EmployerValidaterService {
	
	boolean checkPaswordd(Employer employer);
	boolean checkField(Employer employer);
	boolean checkMail(Employer employer ,EmployerDao employerDao);
	boolean checkMail(Employer employer);

}
