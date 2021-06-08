package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.CvPrewriting;

public interface CvPrewritingDaoService {
	Result add(CvPrewriting cvPrewriting);
	
	DataResult<List<CvPrewriting>> getAll();
}
