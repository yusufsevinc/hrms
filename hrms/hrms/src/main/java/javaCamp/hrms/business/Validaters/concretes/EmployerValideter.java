package javaCamp.hrms.business.Validaters.concretes;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import javaCamp.hrms.business.Validaters.abstracts.EmployerValidaterService;
import javaCamp.hrms.dataAccess.abstracts.EmployerDao;
import javaCamp.hrms.entitiy.concretes.Employer;
@Service
public class EmployerValideter implements EmployerValidaterService {
	
	private  final String EMAIL_PATTERN = 
			"^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public boolean checkPaswordd(Employer employer) {
		if(employer.getPassword().equals(employer.getRepeatPassword())  ) {
			
			return false;
		}
		return true;
	}
	
	
	@Override
	public boolean checkField(Employer employer) {
		if(employer.getEmail().trim().isEmpty() ||
				employer.getPassword().trim().isEmpty()  ||
				employer.getRepeatPassword().trim().isEmpty()  ||
				employer.getWebSite().trim().trim().isEmpty()  ||
				employer.getCompanyName().trim().isEmpty()  ||
				employer.getPhone().trim().isEmpty() ) {
			
			return true;
		}
			return false;
		
		
		
	}

	@Override
	public boolean checkMail(Employer employer) {
	
		
        Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		
		if(pattern.matcher(employer.getEmail()).find() ) {
			return false;
		}
			return true;
		
		
	}

	@Override
	public boolean checkMail(Employer employer, EmployerDao employerDao) {
		List<Employer> data = employerDao.findAll();
		
        
		
		for (Employer item : data) {
			if(item.getEmail().equals(employer.getEmail())) {
				return true;
			}
			
		}
			return false;
		
	
	}


	
	

}
