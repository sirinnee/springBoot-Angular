package com.sirine.Mini_Projet.dto;

import java.util.Date;
import java.util.List;

import com.sirine.Mini_Projet.entity.Regroupement;
import com.sirine.Mini_Projet.entity.SeanceCours;
import lombok.*;
@Getter
@Setter
@Builder 
public class RegroupementDto {
	//deesign pattern de conception / ou/ patron de conception => à de role principale la simplification du transfert de données 
	private Long id;
	private String nomSalle;
	private List<SeanceCoursDto> seanceCourss ;
	
	public static RegroupementDto fromEntity(Regroupement regroupement) {
	    return RegroupementDto.builder()
	        .id(regroupement.getId())
	        .nomSalle(regroupement.getNomSalle())
	        .build();
	  }
	  public static Regroupement toEntity(RegroupementDto regroupementDto) {
	    return Regroupement.builder()
	    		.id(regroupementDto.getId())
	    		.nomSalle(regroupementDto.getNomSalle())
	        .build();
	  }
}
