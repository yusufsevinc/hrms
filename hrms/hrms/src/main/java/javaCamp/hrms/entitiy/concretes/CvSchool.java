package javaCamp.hrms.entitiy.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_school")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})

public class CvSchool {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_school_id")
	private int schoolId;
	
	@Column(name = "start_date")
	private Date startDate;
	

	@Column(name = "end_date" )
	private Date endDate;
	
	
	@ManyToOne()
	@JoinColumn(name = "school_id" )
	private School school;
	
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CV cv;
	
	
	
	
	

}
