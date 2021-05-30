package javaCamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javaCamp.hrms.entitiy.concretes.Advertisement;

public interface AdvertisementDao extends JpaRepository<Advertisement, Integer> {
	List<Advertisement> getByActive(boolean active);
	List<Advertisement> getByEmployerId(int employerId);
	List<Advertisement> findByActiveTrueOrderByCreateDate();
	Advertisement getById(int Id);

}
