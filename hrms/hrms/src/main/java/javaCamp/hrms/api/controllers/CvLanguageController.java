package javaCamp.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.CvLanguageDaoService;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvLanguage;

@RestController
@RequestMapping("api/cvLanguage")
public class CvLanguageController {

	private CvLanguageDaoService cvLanguageDaoService;

	@Autowired
	public CvLanguageController(CvLanguageDaoService cvLanguageDaoService) {
		super();
		this.cvLanguageDaoService = cvLanguageDaoService;
	}
	
	@PostMapping("/add")
	public Result add( CvLanguage cvLanguage) {
		return this.cvLanguageDaoService.add(cvLanguage);
	}
	
	
}
