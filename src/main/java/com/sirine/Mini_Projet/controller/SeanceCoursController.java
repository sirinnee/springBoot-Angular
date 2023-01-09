package com.sirine.Mini_Projet.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirine.Mini_Projet.dto.SeanceCoursDto;
import com.sirine.Mini_Projet.service.SeancesCoursServicesInterfacee;
import com.sirine.Mini_Projet.service.implementation.ServiceImplementation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController 
@CrossOrigin ("localhos/4200")
@RequestMapping("api/v1/Seances")
public class SeanceCoursController {
	//@Autowired fi blaset @RequiredArgsConstructor sinon constructor l3ady (3 method)(getter ne fait pas l'injection de dependances ken setter w a7sen method na3mlou biha injection de dependance hya l constructor
	private final SeancesCoursServicesInterfacee interfws;
	@PostMapping("/saveSeance")
	public SeanceCoursDto store(@RequestBody SeanceCoursDto seanceCoursDto)
	{
		return interfws.save(seanceCoursDto);
	}
	
	@DeleteMapping("/deleteSchool/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        // TODO Auto-generated method stub
		interfws.delete(id);
    }
	@GetMapping(value = "/getAllSeances")
    public List<SeanceCoursDto > findAll() {
        // TODO Auto-generated method stub
        return interfws.listeSancesCours();
    }
    @GetMapping(value = "/getSeance/{id}")
    public SeanceCoursDto  findById(@PathVariable(value = "id") Long id) {
        // TODO Auto-generated method stub
        return interfws.findById(id);
    }

}
