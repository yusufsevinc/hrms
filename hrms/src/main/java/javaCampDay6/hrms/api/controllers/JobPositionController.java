package javaCampDay6.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCampDay6.hrms.business.abstracts.IJobPositionService;
import javaCampDay6.hrms.entitiy.concretes.JobPosition;


@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {
	
	private IJobPositionService jobPositionService;

	@Autowired
	public JobPositionController(IJobPositionService jobPositionService) {
		
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	
	
	
	

}
