package com.sirine.Mini_Projet.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Regroupement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String nomSalle;
@OneToMany(mappedBy = "regroupement" ,fetch = FetchType.LAZY)
private List<SeanceCours> seanceCourss ;

}
