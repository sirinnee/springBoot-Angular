
package com.sirine.Mini_Projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sirine.Mini_Projet.entity.SeanceCours;
@Repository
public interface SeanceCoursRepoditory extends JpaRepository<SeanceCours, Long>{

}
