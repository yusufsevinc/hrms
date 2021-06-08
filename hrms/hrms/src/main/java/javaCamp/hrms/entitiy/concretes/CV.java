package javaCamp.hrms.entitiy.concretes;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker"})

public class CV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id" )
	private int cvId;
	

	@Column(name = "cv_name")
	private String cvName;
	
	

	@Column(name = "created_on")
	private LocalDateTime createdOn = LocalDateTime.now();
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private JobSeeker jobSeeker; 
	
	@OneToMany(mappedBy = "cv")
	private List<CvLanguage> cvLanguage;
	
	
	
	@OneToMany(mappedBy = "cv")
	private List<CvSchool> cvSchool;
	
	@OneToMany(mappedBy = "cv")
	private List<CvExperience> cvExperience;
	
	
	@OneToMany(mappedBy = "cv")
	private List<CvSkill> cvSkill;
	
	@OneToMany(mappedBy = "cv")
	private List<Link> link;
	
	@OneToMany(mappedBy = "cv")
	private List<CvPrewriting> cvPrewriting;
	
	@OneToMany(mappedBy = "cv")
	private List<Photograph> cvPhotograph;
	
	
}
