package com.sirine.Mini_Projet.dto;

import java.util.Date;
import java.util.List;
import java.util.List;
import lombok.*;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sirine.Mini_Projet.entity.Affectation;
import com.sirine.Mini_Projet.entity.PromotionGroupeEAD;
@Getter
@Setter
@Builder
public class PromotionGroupeEADDto {
	private int codeGroupe;
	private String nomGroupe;
	private int niveau;
	private int nbrEtudiants;
	private Date dateDemarrage;
	private Date dateCloture;
	private String nomDiplome;
	@JsonIgnore //5ater manich moutalba njibha kif n3abii 
	private List<AffectationDto> affecations ;

	
	public static PromotionGroupeEADDto fromEntity(PromotionGroupeEAD promotionGroupeEAD) {
	    return PromotionGroupeEADDto.builder()
	        .codeGroupe(promotionGroupeEAD.getCodeGroupe())
	        .nomGroupe(promotionGroupeEAD.getNomGroupe())
	        .nbrEtudiants(promotionGroupeEAD.getNbrEtudiants())
	        .niveau(promotionGroupeEAD.getNiveau())
	        .dateDemarrage(promotionGroupeEAD.getDateDemarrage())
	        .nomDiplome(promotionGroupeEAD.getNomDiplome())
	        .build();
	  }
	  public static PromotionGroupeEAD toEntity(PromotionGroupeEADDto promotionGroupeEADDto) {
	    return PromotionGroupeEAD.builder()
	    		.codeGroupe(promotionGroupeEADDto.getCodeGroupe())
	    		  .nomGroupe(promotionGroupeEADDto.getNomGroupe())
	    		   .nbrEtudiants(promotionGroupeEADDto.getNbrEtudiants())
	  	        .niveau(promotionGroupeEADDto.getNiveau())
	  	        .dateDemarrage(promotionGroupeEADDto.getDateDemarrage())
	  	      .dateCloture(promotionGroupeEADDto.getDateCloture())
	  	    .nomDiplome(promotionGroupeEADDto.getNomDiplome())
	        .build();
	  }
}
