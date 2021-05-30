package javaCamp.hrms.business.Validaters.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javaCamp.hrms.business.Validaters.abstracts.JobSeekerValidaterService;
import javaCamp.hrms.dataAccess.abstracts.JobSeekerDao;
import javaCamp.hrms.entitiy.concretes.Employer;
import javaCamp.hrms.entitiy.concretes.JobSeeker;

@Service
public class JobSeekerValidater implements JobSeekerValidaterService {

	@Override
	public boolean checkPassword(JobSeeker jobSeeker) {
		if (jobSeeker.getPassword().equals(jobSeeker.getRepeatPassword())) {

			return false;
		}
		return true;
	}

	@Override
	public boolean checkTcNo(JobSeeker jobSeeker) {
		// Mernis ekelenecek
		return false;
	}

	@Override
	public boolean checkFiled(JobSeeker jobSeeker) {
		if (jobSeeker.getEmail().trim().isEmpty() || jobSeeker.getPassword().trim().isEmpty()
				|| jobSeeker.getRepeatPassword().trim().isEmpty() || jobSeeker.getFirstName().trim().trim().isEmpty()
				|| jobSeeker.getLastName().trim().isEmpty() || jobSeeker.getDateBirth().toString().trim().isEmpty()
				|| jobSeeker.getIdentityNumber().trim().isEmpty()) {

			return true;
		}
		return false;

	}

	@Override
	public boolean checkEmail(JobSeeker jobSeeker, JobSeekerDao jobSeekerDao) {


		if (jobSeekerDao.getByEmail(jobSeeker.getEmail()) == null) {

			return true;
		}

		return false;

	}
}
