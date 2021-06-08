package javaCamp.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javaCamp.hrms.business.abstracts.PhotographDaoService;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CV;
import javaCamp.hrms.entitiy.concretes.Photograph;

@RestController
@RequestMapping("/api/photographsController")
public class PhotographsController {

	private PhotographDaoService photographDaoService;

	@Autowired
	public PhotographsController(PhotographDaoService photographDaoService) {
		super();
		this.photographDaoService = photographDaoService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody MultipartFile file, @RequestParam int cvId) {
		Photograph photograph = new Photograph();
		CV cv = new CV();
		cv.setCvId(cvId);
		photograph.setCv(cv);
		return ResponseEntity.ok(this.photographDaoService.add(photograph, file));
	}

	@DeleteMapping("/delete")
	public Result delete(@RequestBody Photograph photograph) {
		return this.photographDaoService.delete(photograph);
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(this.photographDaoService.getAll());
	}
}
