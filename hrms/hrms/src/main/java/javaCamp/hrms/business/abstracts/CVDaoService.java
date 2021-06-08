package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CV;

public interface CVDaoService {
	
	Result add(CV cv);
	DataResult<List<CV>> getAll(); 
	
	DataResult<List<CV>> getByCvId(int cvId);
	

}
