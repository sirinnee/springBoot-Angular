package com.sirine.Mini_Projet.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirine.Mini_Projet.dao.AffectationRepository;
import com.sirine.Mini_Projet.dao.PromotionGroupeRepository;
import com.sirine.Mini_Projet.dto.AffectationDto;
import com.sirine.Mini_Projet.entity.Affectation;
import com.sirine.Mini_Projet.service.AffectationServiceInterface;
@Service
public class AffectationImplementation implements AffectationServiceInterface {
	@Autowired
	private AffectationRepository repository;
	@Override
	public AffectationDto save(AffectationDto a) {
		Affectation af =AffectationDto.toEntity(a);
		Affectation savedaf =repository.save(af);
		return AffectationDto.fromEntity(savedaf);
	}

}
