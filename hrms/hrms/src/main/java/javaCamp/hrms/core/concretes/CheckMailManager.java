package javaCamp.hrms.core.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import javaCamp.hrms.core.checkMail.abstracts.CheckMailService;

@Service
public class CheckMailManager<T> implements CheckMailService<T>{
	
	private  final String EMAIL_PATTERN = 
			"^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	@Override
	public boolean checMail(String data) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		
		if(pattern.matcher(data).find() ) {
			return false;
		}
			return true;
	}

	
	
	
	

}
