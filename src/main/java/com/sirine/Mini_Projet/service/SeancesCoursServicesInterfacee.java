package com.sirine.Mini_Projet.service;

import java.util.List;

import com.sirine.Mini_Projet.dto.SeanceCoursDto;

public interface SeancesCoursServicesInterfacee {
	SeanceCoursDto save(SeanceCoursDto seanceCoursDto);
	void delete(Long id);
	List<SeanceCoursDto> listeSancesCours();
	SeanceCoursDto findById(Long id);

}
