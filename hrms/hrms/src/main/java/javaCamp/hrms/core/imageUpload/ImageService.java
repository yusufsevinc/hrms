package javaCamp.hrms.core.imageUpload;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import javaCamp.hrms.core.utilies.results.DataResult;

public interface ImageService {

	DataResult<?> save(MultipartFile file);
	DataResult<Map> upload(MultipartFile multipartFile) throws IOException;
	DataResult<Map> delete (String id) throws IOException;
}
