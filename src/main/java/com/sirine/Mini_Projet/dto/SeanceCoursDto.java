package com.sirine.Mini_Projet.dto;
import java.util.Date;

import com.sirine.Mini_Projet.entity.Regroupement;
import com.sirine.Mini_Projet.entity.SeanceCours;

import lombok.*;
@Getter
@Setter
@Builder   //design pattern de conception :(na3mlou bih mapping entre les attributs)

public class SeanceCoursDto {
	private long codeSeanceCours;
	private Date dateJour;
	private Date heureDebut;
	private Date heureFin;
	private RegroupementDto regroupement;

public static SeanceCoursDto fromEntity(SeanceCours seanceCours) {
    return SeanceCoursDto.builder()
        .codeSeanceCours(seanceCours.getCodeSeanceCours())
        .dateJour(seanceCours.getDateJour())
        .heureDebut(seanceCours.getHeureDebut())
        .heureFin(seanceCours.getHeureFin())
        .regroupement(RegroupementDto.fromEntity(seanceCours.getRegroupement()))
        .build();
  }
  public static SeanceCours toEntity(SeanceCoursDto seanceCoursDto) {
    return SeanceCours.builder()
    		.codeSeanceCours(seanceCoursDto.getCodeSeanceCours())
            .dateJour(seanceCoursDto.getDateJour())
            .heureDebut(seanceCoursDto.getHeureDebut())
            .heureFin(seanceCoursDto.getHeureFin())
            .regroupement(RegroupementDto.toEntity(seanceCoursDto.getRegroupement()))
        .build();
  }
}
