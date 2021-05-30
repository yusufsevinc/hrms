package javaCamp.hrms.api.controllers;

import java.util.List;

import javax.persistence.PostUpdate;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import javaCamp.hrms.business.abstracts.AdvertisementDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Advertisement;

@RestController
@RequestMapping("api/advertisements")
public class AdvertisementController {
	
	private AdvertisementDaoService advertisementDaoService;

	
	@Autowired
	public AdvertisementController(AdvertisementDaoService advertisementDaoService) {
		super();
		this.advertisementDaoService = advertisementDaoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Advertisement advertisement) {
		
		return this.advertisementDaoService.add(advertisement);
		
	}
	
	@GetMapping("/findActive")
	public DataResult<List<Advertisement>> findActive(@RequestParam boolean active){
		
		return this.advertisementDaoService.getByActive(active);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Advertisement>> getAll(){
		
		return this.advertisementDaoService.getAll();
	}
	
	@GetMapping("/findEmployer")
	public DataResult<List<Advertisement>>findEmployer(@RequestParam int employerId){
		
		return this.advertisementDaoService.getByEmployerId(employerId);
	}
	
	@GetMapping("/getAllActiveOrderByDate")
	public DataResult<List<Advertisement>> getAllActiveOrderDate(){
		return this.advertisementDaoService.findByActiveTrueOrderByCreateDate();
	}
	
	@PutMapping("/setActive")
	public DataResult<Advertisement>  setActive(@RequestParam int id){
		return this.advertisementDaoService.getById(id);
	}
	
}
