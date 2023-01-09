package com.sirine.Mini_Projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirine.Mini_Projet.entity.Regroupement;

//jpaRepository c'est une interface implémenté par hibernate
public interface regroupementRepository extends JpaRepository<Regroupement,Long>{

}
