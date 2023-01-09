package com.sirine.Mini_Projet.controller;
import org.springframework.web.bind.annotation.*;

import com.sirine.Mini_Projet.dto.*;
import com.sirine.Mini_Projet.service.*;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController 
@CrossOrigin ("localhos/4200")
@RequestMapping("api/v1/Affecation")
public class AffecationController {
	private final AffectationServiceInterface service;
	@PostMapping("/saveAffectation")
	public AffectationDto save(@RequestBody AffectationDto dto)
	{
		return service.save(dto);
	}

}
