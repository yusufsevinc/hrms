package javaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hrms.business.abstracts.LinkDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.entitiy.concretes.Link;

@RestController
@RequestMapping("api/linkController")
public class LinkController {
	
	private LinkDaoService linkDaoService;

	@Autowired
	public LinkController(LinkDaoService linkDaoService) {
		super();
		this.linkDaoService = linkDaoService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Link link) {
		return this.linkDaoService.add(link);
	}
	
	@GetMapping
	public DataResult<List<Link>> getAll(){
		return this.linkDaoService.getAll();
	}

}
