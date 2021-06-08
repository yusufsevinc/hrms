package javaCamp.hrms.business.abstracts;

import java.util.List;

import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.entitiy.concretes.Link;

public interface LinkDaoService {
	
	Result add(Link link);
	
	DataResult<List<Link>> getAll();

}
