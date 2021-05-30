package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Advertisement;

public interface AdvertisementDaoService {
	
	Result add(Advertisement advertisement);
	DataResult<List<Advertisement>> getAll();
	DataResult<List<Advertisement>> getByActive(boolean active);
	DataResult<List<Advertisement>>  getByEmployerId(int employerId);
	DataResult<List<Advertisement>> findByActiveTrueOrderByCreateDate();
	DataResult<Advertisement> getById(int id);

}
