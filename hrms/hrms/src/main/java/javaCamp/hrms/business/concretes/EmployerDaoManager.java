package javaCamp.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.hrms.business.Validaters.abstracts.EmployerValidaterService;
import javaCamp.hrms.business.abstracts.EmployerDaoService;
import javaCamp.hrms.core.mailConfirmation.abstracts.MailConfirmationService;
import javaCamp.hrms.core.utilies.results.DataResult;
import javaCamp.hrms.core.utilies.results.ErrorResult;
import javaCamp.hrms.core.utilies.results.Result;
import javaCamp.hrms.core.utilies.results.SuccesDataResult;
import javaCamp.hrms.core.utilies.results.SuccesResult;
import javaCamp.hrms.dataAccess.abstracts.EmployerDao;
import javaCamp.hrms.entitiy.concretes.Employer;



@Service
public class EmployerDaoManager implements EmployerDaoService{

	private EmployerDao employerDao;
	private EmployerValidaterService employerValidaterService;
	private MailConfirmationService mailConfirmationService;

	
	@Autowired
	public EmployerDaoManager(EmployerDao employerDao ,EmployerValidaterService employerValidaterService ,
			MailConfirmationService mailConfirmationService) {

		super();
		this.employerDao = employerDao ;
		this.employerValidaterService = employerValidaterService;
		this.mailConfirmationService = mailConfirmationService;
	}
	

	@Override
	public DataResult<List<Employer>> getAll(){
		return new SuccesDataResult<List<Employer>>(this.employerDao.findAll(),"başarıyla listlendi");
	}




	@Override
	public Result add(Employer employer) {
		if(employerValidaterService.checkField(employer)) {
			return new ErrorResult("Lütfen bütün alanları doldurunuz !");
			
		}else if(employerValidaterService.checkPaswordd(employer)){
			return new ErrorResult("Parolalar Eşleşmiyor !");
		
		}else if(employerValidaterService.checkMail(employer)){
			return new ErrorResult("Geçerisiz mail adresi....");
		
			
		}else if(employerValidaterService.checkMail(employer, employerDao)) {
			return new ErrorResult("Mail adresi sistemde mevcut farklı bir mail adresi Giriniz ! ");
		
		}else if(!mailConfirmationService.isConfirmation()) {
			return new ErrorResult("mail adresi onaylama başarısız");
			
		}else {
			  this.employerDao.save(employer);
			return new SuccesResult("Başarıyla eklendi");
		}
		
		

	}








}
