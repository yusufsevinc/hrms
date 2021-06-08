package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.SchoolDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.School;

@RestController
@RequestMapping("api/schoolController")
public class SchoolController {
	
	private SchoolDaoService schoolDaoService;

	@Autowired
	public SchoolController(SchoolDaoService schoolDaoService) {
		super();
		this.schoolDaoService = schoolDaoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		return schoolDaoService.add(school);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<School>> getAll(){
		return this.schoolDaoService.getAll();
		
	}

	
}
