package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.abstracts.LinkDaoService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.LinkDao;
import javaCamp.hrms.entitiy.concretes.Link;
@Service
public class LinkDaoManager implements LinkDaoService{
	
	private LinkDao linkDao;
	
	@Autowired
	public LinkDaoManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccesResult("Sosyal medya eklendi");
	}

	@Override
	public DataResult<List<Link>> getAll() {

		return new SuccesDataResult<List<Link>>(this.linkDao.findAll(),"Linkler listelendi");
	}

}
