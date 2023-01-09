package com.sirine.Mini_Projet.entity;

import java.util.Date;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Affectation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date dateDebutEns;
	private Date dateFinEns;
	private Date dateExamen;
	@ManyToOne
	@JoinColumn(name="promotion_groupe_code")
	private PromotionGroupeEAD promotionGroupeEAD;
	
}
