package javaCamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.hrms.entitiy.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {
	

}
