package javaCamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.entitiy.concretes.Employer;
import javaCamp.hrms.entitiy.concretes.User;



public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
