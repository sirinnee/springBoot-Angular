package com.sirine.Mini_Projet.dto;

import java.util.Date;

import javax.persistence.ManyToOne;
import lombok.*;

import com.sirine.Mini_Projet.dto.PromotionGroupeEADDto.PromotionGroupeEADDtoBuilder;
import com.sirine.Mini_Projet.entity.Affectation;
import com.sirine.Mini_Projet.entity.PromotionGroupeEAD;
@Builder
@Getter
@Setter

public class AffectationDto {
	private int id;
	private Date dateDebutEns;
	private Date dateFinEns;
	private Date dateExamen;
	private PromotionGroupeEADDto promotionGroupeEADDto;
	
	public static AffectationDto fromEntity(Affectation affectation) {
	    return AffectationDto.builder()
	        .id(affectation.getId())
	        .dateDebutEns(affectation.getDateDebutEns())
	        .dateFinEns(affectation.getDateFinEns())
	        .dateExamen(affectation.getDateExamen())
	        .promotionGroupeEADDto(PromotionGroupeEADDto.fromEntity(affectation.getPromotionGroupeEAD()))
	        .build();
	  }
	  public static Affectation toEntity(AffectationDto affectationDto) {
	    return Affectation.builder()
	    		.id(affectationDto.getId())
	    		  .dateDebutEns(affectationDto.getDateDebutEns())
	  	        .dateFinEns(affectationDto.getDateFinEns())
	  	        .dateExamen(affectationDto.getDateExamen())
	  	      .promotionGroupeEAD(PromotionGroupeEADDto.toEntity(affectationDto.getPromotionGroupeEADDto()))
		        
	        .build();
	  }
	
}
