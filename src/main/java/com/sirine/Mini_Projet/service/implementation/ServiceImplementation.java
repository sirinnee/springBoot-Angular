package com.sirine.Mini_Projet.service.implementation;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirine.Mini_Projet.dao.SeanceCoursRepoditory;
import com.sirine.Mini_Projet.dto.SeanceCoursDto;
import com.sirine.Mini_Projet.entity.SeanceCours;
import com.sirine.Mini_Projet.service.SeancesCoursServicesInterfacee;
@Service
public class ServiceImplementation implements SeancesCoursServicesInterfacee {
	@Autowired
	private SeanceCoursRepoditory seanceCoursRepoditory;
	@Override
	public SeanceCoursDto save(SeanceCoursDto seanceCoursDto) {
		// TODO Auto-generated method stub
		SeanceCours sc =SeanceCoursDto.toEntity(seanceCoursDto);
		SeanceCours savedSc =seanceCoursRepoditory.save(sc);
		return SeanceCoursDto.fromEntity(savedSc);
	}
	@Override
	public void delete(Long id) {
		seanceCoursRepoditory.deleteById(id);;
	}
	@Override
	public List<SeanceCoursDto> listeSancesCours() {
		
		return  seanceCoursRepoditory.findAll().stream().map(SeanceCoursDto::fromEntity).collect(Collectors.toList());
	}
	@Override
	public SeanceCoursDto findById(Long id) {
		return SeanceCoursDto.fromEntity( seanceCoursRepoditory.findById(id).get());
		
	}

}
