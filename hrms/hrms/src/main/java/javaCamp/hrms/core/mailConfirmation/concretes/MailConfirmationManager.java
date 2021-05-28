package javaCamp.hrms.core.mailConfirmation.concretes;

import org.springframework.stereotype.Service;

import javaCamp.hrms.core.mailConfirmation.abstracts.MailConfirmationService;
@Service
public class MailConfirmationManager implements MailConfirmationService {

	@Override
	public boolean isConfirmation() {
		
		return true;
	}

}
