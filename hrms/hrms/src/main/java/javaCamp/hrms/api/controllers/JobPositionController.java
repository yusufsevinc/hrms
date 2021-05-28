package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.JobPositionDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.JobPosition;

@RestController
@RequestMapping("api/jobpositions")
public class JobPositionController {
	
	private JobPositionDaoService jobPositionDaoService;

	
	@Autowired
	public JobPositionController(JobPositionDaoService jobPositionDaoService) {
		super();
		this.jobPositionDaoService = jobPositionDaoService;
	}
		
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionDaoService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionDaoService.add(jobPosition);
		
	}
	
	
		
	

}
