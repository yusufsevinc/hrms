package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.EmployerDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Employer;
import javaCamp.hrms.entitiy.concretes.JobPosition;



@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	private EmployerDaoService employerDaoService;

	@Autowired
	public EmployerController(EmployerDaoService employerDaoService) {
		super();
		this.employerDaoService = employerDaoService;
	}
	
	//veri isteme
		@GetMapping("/getall")
		public DataResult<List<Employer>> getAll(){
			return this.employerDaoService.getAll();
			
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody Employer employer){
			return this.employerDaoService.add(employer);
			
			
		}
		
		
	
	
	

}
