package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.LanguageDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Language;

@RestController
@RequestMapping("api/langugae")
public class LanguageController {

	private LanguageDaoService languageDaoService;

	@Autowired
	public LanguageController(LanguageDaoService languageDaoService) {
		super();
		this.languageDaoService = languageDaoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageDaoService.add(language);
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Language>> getAll(){
		
		return this.languageDaoService.getAll();
		
	}
	
	
}
