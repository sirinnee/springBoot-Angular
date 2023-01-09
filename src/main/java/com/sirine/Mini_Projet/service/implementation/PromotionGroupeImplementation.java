package com.sirine.Mini_Projet.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirine.Mini_Projet.dao.PromotionGroupeRepository;
import com.sirine.Mini_Projet.dto.PromotionGroupeEADDto;
import com.sirine.Mini_Projet.dto.SeanceCoursDto;
import com.sirine.Mini_Projet.dto.PromotionGroupeEADDto;
import com.sirine.Mini_Projet.entity.PromotionGroupeEAD;
import com.sirine.Mini_Projet.service.PromotionGroupeServiceInterface;
@Service
public class PromotionGroupeImplementation implements PromotionGroupeServiceInterface{
	@Autowired
	private PromotionGroupeRepository repository;
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		// TODO Auto-generated method stub	
	}
	@Override
	public PromotionGroupeEADDto save(PromotionGroupeEADDto p) {
		// TODO Auto-generated method stub
		PromotionGroupeEAD pg=PromotionGroupeEADDto.toEntity(p);
		PromotionGroupeEAD savedPg =repository.save(pg);
		return PromotionGroupeEADDto.fromEntity(savedPg);
		
	}

	@Override
	public List<PromotionGroupeEADDto> getAll() {
		// TODO Auto-generated method stub
		return  repository.findAll().stream().map(PromotionGroupeEADDto::fromEntity).collect(Collectors.toList());
	}

	@Override
	public PromotionGroupeEADDto findById(Integer id) {
		// TODO Auto-generated method stub
		return PromotionGroupeEADDto.fromEntity( repository.findById(id).get());
	}
	
}
