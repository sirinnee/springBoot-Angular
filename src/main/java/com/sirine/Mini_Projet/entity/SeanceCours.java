package com.sirine.Mini_Projet.entity;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;

import com.sirine.Mini_Projet.dto.SeanceCoursDto;

import lombok.*;

import lombok.Setter;
@Entity
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeanceCours {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//hibernate incrémentation automatique
private long codeSeanceCours;
private Date dateJour;
private Date heureDebut;
private Date heureFin;
@ManyToOne
@JoinColumn(name="regroupement_id")
private Regroupement regroupement;

}
