package javaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.Validaters.abstracts.JobSeekerValidaterService;
import javaCamp.hrms.business.abstracts.CvExperienceDaoService;
import javaCamp.hrms.business.abstracts.CvLanguageDaoService;
import javaCamp.hrms.business.abstracts.CvPrewritingDaoService;
import javaCamp.hrms.business.abstracts.CvSchoolDaoService;
import javaCamp.hrms.business.abstracts.JobSeekerDaoService;
import javaCamp.hrms.business.abstracts.LinkDaoService;
import javaCamp.hrms.business.abstracts.PhotographDaoService;
import javaCamp.hrms.core.checkMail.abstracts.CheckMailService;
import javaCamp.hrms.core.mailConfirmation.abstracts.MailConfirmationService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.ErrorResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.CvSkillDao;
import javaCamp.hrms.dataAccess.abstracts.JobSeekerDao;
import javaCamp.hrms.entitiy.concretes.JobSeeker;
import springfox.documentation.swagger2.mappers.ModelMapper;
@Service
public class JobSeekerDaoManager implements JobSeekerDaoService {
	
	private JobSeekerDao jobSeekerDao;
	private JobSeekerValidaterService JobSeekerValidaterService;
	private CheckMailService<JobSeeker> checkMailService;
	private MailConfirmationService mailConfirmationService;
	
	@Autowired
	public JobSeekerDaoManager(JobSeekerDao jobSeekerDao,
			JobSeekerValidaterService jobSeekerValidaterService,
			CheckMailService<JobSeeker> checkMailService,
			MailConfirmationService mailConfirmationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		JobSeekerValidaterService = jobSeekerValidaterService;
		this.checkMailService = checkMailService;
		this.mailConfirmationService = mailConfirmationService;
		
	}
 
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
	}

	

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(JobSeekerValidaterService.checkFiled(jobSeeker)) {
			return new ErrorResult("Bütün alanları doldurunuz!");
			
			
		}else if(checkMailService.checMail(jobSeeker.getEmail())) {
			return new ErrorResult("Geçerisiz mail  adresi! ");
			
			
		}else if(!JobSeekerValidaterService.checkEmail(jobSeeker,jobSeekerDao)) {
			return new ErrorResult("Mail  adresiniz sistemde mevcut! ");
			
		}else if(JobSeekerValidaterService.checkPassword(jobSeeker)) {
			return new ErrorResult("Parolar Eşleşmiyor! ");
			
		}else if(!mailConfirmationService.isConfirmation()) {
			return new ErrorResult("mail adresi onaylama başarısız");
				
		}else {
			
			this.jobSeekerDao.save(jobSeeker);
			return new SuccesResult("Job Seeker Başarıyla Eklendi");
		}
		
		
	}

	
	
	

}
