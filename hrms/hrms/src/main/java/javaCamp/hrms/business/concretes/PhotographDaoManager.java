package javaCamp.hrms.business.concretes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javaCamp.hrms.business.abstracts.PhotographDaoService;
import javaCamp.hrms.core.imageUpload.ImageService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.PhotographDao;
import javaCamp.hrms.entitiy.concretes.Photograph;
import springfox.documentation.swagger2.mappers.ModelMapper;
@Service
public class PhotographDaoManager implements PhotographDaoService{

	private PhotographDao photographDao;
	private ImageService imageService;
	private ModelMapper modelMapper;

	@Autowired
	public PhotographDaoManager(PhotographDao photographDao, ImageService imageService) {
		this.photographDao = photographDao;
		this.imageService = imageService;
	}

	

	@Override
	public Result add(Photograph photograph) {
		this.photographDao.save(photograph);
		return new SuccesResult("Photo added");
	}

	
	@Override
	public Result addAll(List<Photograph> photograph) {
		photographDao.saveAll(photograph);
		return new SuccesResult();
	}

	@Override
	public Result add(Photograph photograph, MultipartFile file) {
		Map<String, String> result = (Map<String, String>) imageService.save(file).getData();
		String url = result.get("url");
		photograph.setPhotographLink(url);
		photograph.setCreatedOn(LocalDateTime.now());
		return add(photograph);
	}

	
	@Override
	public Result delete(Photograph photograph) {
		this.photographDao.delete(photograph);
		return new SuccesResult("Deletion is successful");
	}

	
	@Override
	public DataResult<List<Photograph>> getAll() {
		return new SuccesDataResult<>(this.photographDao.findAll());
	}

	
	@Override
	public DataResult<List<Photograph>> getAllByUserId(int userId) {
		return new SuccesDataResult<>(this.photographDao.getAllByPhotographId(userId));
	}

	
	@Override
	public DataResult<Photograph> getById(int photographId) {
		return new SuccesDataResult<Photograph>(this.photographDao.getOne(photographId));
	}

}
