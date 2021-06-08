package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.CvPrewritingDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvPrewriting;

@RestController
@RequestMapping("/api/cvPrewiritingController")
public class CvPrewritingController {
	
	private CvPrewritingDaoService cvPreWritingDaoService;

	public CvPrewritingController(CvPrewritingDaoService cvPreWritingDaoService) {
		super();
		this.cvPreWritingDaoService = cvPreWritingDaoService;
	}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody CvPrewriting cvPrewriting) {
		
		return this.cvPreWritingDaoService.add(cvPrewriting);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CvPrewriting>> getAll(){
		return this.cvPreWritingDaoService.getAll();
	}

}
