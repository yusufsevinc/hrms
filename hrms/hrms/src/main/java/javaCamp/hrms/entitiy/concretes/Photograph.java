package javaCamp.hrms.entitiy.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "photographs")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})

public class Photograph {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "photograph_id")
	private int photographId;

	
	@Column(name = "photograph_link")
	private String photographLink;

	@Column(name = "created_on")
	private LocalDateTime createdOn = LocalDateTime.now();

	@ManyToOne()
	@JoinColumn(name = "cv_id")
	
	private CV cv;

}
