package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.CvSkillDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvSkill;


@RestController
@RequestMapping("api/cvSkillController")
public class CvSkillController {
	
	private CvSkillDaoService cvSkillDaoService;

	
	@Autowired
	public CvSkillController(CvSkillDaoService cvSkillDaoService) {
		super();
		this.cvSkillDaoService = cvSkillDaoService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody CvSkill cvSkill) {
		return this.cvSkillDaoService.add(cvSkill);
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<CvSkill>> getAll(){
		return this.cvSkillDaoService.getAll();
	}
	
}
