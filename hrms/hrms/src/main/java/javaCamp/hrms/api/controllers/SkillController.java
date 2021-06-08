package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.SkillDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Skill;

@RestController
@RequestMapping("api/skillController")
public class SkillController {
	
	private SkillDaoService skillDaoService;

	@Autowired
	public SkillController(SkillDaoService skillDaoService) {
		super();
		this.skillDaoService = skillDaoService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		return this.skillDaoService.add(skill);
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Skill>> getAll(){
		return this.skillDaoService.getAll();
	}
}
