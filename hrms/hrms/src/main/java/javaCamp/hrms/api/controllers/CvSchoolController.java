package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.CvSchoolDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvSchool;

@RestController
@RequestMapping("api/cvSchoolController")
public class CvSchoolController {
	
	private CvSchoolDaoService cvSchoolDaoService;

	@Autowired
	public CvSchoolController(CvSchoolDaoService cvSchoolDaoService) {
		super();
		this.cvSchoolDaoService = cvSchoolDaoService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody CvSchool cvSchool) {
		return this.cvSchoolDaoService.add(cvSchool);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvSchool>> getAll(){
		
		return this.cvSchoolDaoService.getAll();
		
	}
	
	
	
	@GetMapping("/getCvSchoolOrderByEndDateDesc")
	public DataResult<List<CvSchool>> getCvSchoolOrderByEndDateDesc(@RequestParam int id){
		
		return this.cvSchoolDaoService.getCvSchoolOrderByEndDateDesc(id);
	}
	
}
