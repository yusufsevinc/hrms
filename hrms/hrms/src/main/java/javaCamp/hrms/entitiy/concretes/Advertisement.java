package javaCamp.hrms.entitiy.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "advertisement")
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Advertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "employer_id")
	private int employerId;
	
	/*
	@Column(name = "job_position_id")
	private int jobPositionId;
	*/
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	/*
	@Column(name = "city_id")
	private int cityId;
	*/
	@Column(name = "employment_number")
	private int employmentNumber;
	
	@Column(name = "deadline")
	private Date deadline;
	
	@Column(name = "create_date")
	private LocalDate createDate = LocalDate.now();
	
	@Column(name = "active")
	private boolean active;
	
	

}
