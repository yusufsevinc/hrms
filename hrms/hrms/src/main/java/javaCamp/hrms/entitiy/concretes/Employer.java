package javaCamp.hrms.entitiy.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","advertisements"})

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employer  extends User{

	@Column(name = "web_site")
	private String webSite;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "phone")
	private String phone;
	


}
