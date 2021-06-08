package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.CVDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CV;

@RestController
@RequestMapping("/api/cv")
public class CVController {
	
	CVDaoService cvDaoService;

	@Autowired
	public CVController(CVDaoService cvDaoService) {
		super();
		this.cvDaoService = cvDaoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CV cv) {
		return this.cvDaoService.add(cv);
		
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<CV>> getAll(){
		return this.cvDaoService.getAll();
	}
	
	@GetMapping("/getByCvId")
	public DataResult<List<CV>> getByCvId(@RequestParam int cvId){
		return this.cvDaoService.getByCvId(cvId);
	}

}
