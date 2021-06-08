package javaCamp.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Photograph;

public interface PhotographDaoService {
	
	Result add(Photograph photograph);

	Result add(Photograph photograph, MultipartFile file);

	Result delete(Photograph photograph);

	DataResult<Photograph> getById(int photographId);

	DataResult<List<Photograph>> getAllByUserId(int userId);

	DataResult<List<Photograph>> getAll();

	Result addAll(List<Photograph> photograph);
	

}
