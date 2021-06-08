package javaCamp.hrms.entitiy.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cv_skill")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})

public class CvSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_skill_id")
	private int cvSkillId;
	
	
	@Column(name = "cv_skill_level" )
	@Min(1)
	@Max(5)
	private int skillLevel;
	
	@OneToOne()
	@JoinColumn(name = "skill_id" )
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name = "cv_id" )
	private CV cv;
	

}
