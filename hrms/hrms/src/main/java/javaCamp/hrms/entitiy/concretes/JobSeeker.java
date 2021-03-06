package javaCamp.hrms.entitiy.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers")

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")

public class JobSeeker  extends User {
	

	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "date_birth")
	private Date dateBirth;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<CV> cv;
	
	
	
	
}
