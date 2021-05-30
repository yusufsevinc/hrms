package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.AdvertisementDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.ErrorDataResult;
import javaCamp.hrms.core.utilies.results.ErrorResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.AdvertisementDao;
import javaCamp.hrms.entitiy.concretes.Advertisement;
import javaCamp.hrms.entitiy.concretes.Employer;
@Service
public class AdvertisementDaoManager implements AdvertisementDaoService{
	
	private AdvertisementDao advertisementDao;
	
	@Autowired
	public AdvertisementDaoManager(AdvertisementDao advertisementDao) {
		super();
		this.advertisementDao = advertisementDao;
	}
	

	@Override
	public Result add(Advertisement advertisement) {
		this.advertisementDao.save(advertisement);
		return new SuccesResult("Advertisement eklendi...");
	}

	

	@Override
	public DataResult<List<Advertisement>> getAll() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Advertisement>>(advertisementDao.findAll(),"başarıyla listlendi");
	}


	@Override
	public DataResult<List<Advertisement>> getByActive(boolean active) {
		
		return new SuccesDataResult<List<Advertisement>>(this.advertisementDao.getByActive(active));
	}


	@Override
	public DataResult<List<Advertisement>> getByEmployerId(int employerId) {
		List<Advertisement> control = this.advertisementDao.getByEmployerId(employerId);
		
		if(control.isEmpty()) {
			return new ErrorDataResult<>("İşverene ait ilan mevcut değil..");
		}else {
			return new SuccesDataResult<>(this.advertisementDao.getByEmployerId(employerId),"İlanlar Listelendi");
		}
		
	}


	@Override
	public DataResult<List<Advertisement>> findByActiveTrueOrderByCreateDate() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Advertisement>>(advertisementDao.findByActiveTrueOrderByCreateDate());
	}


	@Override
	public DataResult<Advertisement> getById(int id) {
		Advertisement advertisement = advertisementDao.getById(id);
		
		if(advertisement != null) {
			if(advertisement.isActive()) {
				advertisement.setActive(false);
				advertisementDao.save(advertisement);
				return new SuccesDataResult("İlan devre dışı bırakıldı....");
			}else {
				return new ErrorDataResult("İlan zaten devre dışı...");
			}
			
		}else{
			
			return new ErrorDataResult("İlan bulunamadı!");
		}
		
	}


	

	





}
