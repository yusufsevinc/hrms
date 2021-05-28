package javaCamp.hrms.entitiy.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor


@Table(name = "job_seekers")

public class JobSeeker  extends User {
	
	@Column(name = "user_id")
	private int user_id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "date_birth")
	private Date dateBirth;
	
	@Column(name = "tc_no")
	private String tcNo;
	
}
