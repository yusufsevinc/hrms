package javaCamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Photograph;

public interface PhotographDao extends JpaRepository<Photograph, Integer> {
	List<Photograph> getAllByPhotographId(int userId);


}
