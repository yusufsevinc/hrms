package javaCamp.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.CvExperienceDaoService;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvExperience;


@RestController
@RequestMapping("/api/cvExperience")
public class CvExperienceController {
	
	private CvExperienceDaoService cvExperienceDaoService;

	@Autowired
	public CvExperienceController(CvExperienceDaoService cvExperienceDaoService) {
		super();
		this.cvExperienceDaoService = cvExperienceDaoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvExperience cvExperience) {
		return this.cvExperienceDaoService.add(cvExperience);
		
		
	}
	

}
