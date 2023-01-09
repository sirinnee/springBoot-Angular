package com.sirine.Mini_Projet.service;

import java.util.List;

import com.sirine.Mini_Projet.dto.PromotionGroupeEADDto;
import com.sirine.Mini_Projet.dto.SeanceCoursDto;

public interface PromotionGroupeServiceInterface {
	void delete(Integer id);
PromotionGroupeEADDto save(PromotionGroupeEADDto p);
	List<PromotionGroupeEADDto> getAll();
	PromotionGroupeEADDto findById(Integer id);
}
