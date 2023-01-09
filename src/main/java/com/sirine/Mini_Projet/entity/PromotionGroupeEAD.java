package com.sirine.Mini_Projet.entity;
import java.util.Date;
import java.util.List;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class PromotionGroupeEAD {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codeGroupe;
	private String nomGroupe;
	private int niveau;
	private int nbrEtudiants;
	private Date dateDemarrage;
	private Date dateCloture;
	private String nomDiplome;
	@OneToMany(mappedBy="promotionGroupeEAD")
	
	private List<Affectation> affectations ;
	
}
