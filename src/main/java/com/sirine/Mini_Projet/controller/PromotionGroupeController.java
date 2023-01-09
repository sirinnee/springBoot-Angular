package com.sirine.Mini_Projet.controller;
import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sirine.Mini_Projet.dto.*;
import com.sirine.Mini_Projet.service.*;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController 
@CrossOrigin ("localhos/4200")
@RequestMapping("api/v1/PromotionGroupe")
public class PromotionGroupeController {
	private final PromotionGroupeServiceInterface service;
	@PostMapping("/savePromotion")
	public PromotionGroupeEADDto save(@RequestBody PromotionGroupeEADDto dto)
	{
		return service.save(dto);
	}

	@DeleteMapping("/deletePromotion/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        // TODO Auto-generated method stub
		service.delete(id);
    }
	@GetMapping(value = "/getAll")
    public List<PromotionGroupeEADDto > findAll() {
        // TODO Auto-generated method stub
        return service.getAll();
    }
    @GetMapping(value = "/getPromotion/{id}")
    public PromotionGroupeEADDto  findById(@PathVariable(value = "id") Integer id) {
        // TODO Auto-generated method stub
        return service.findById(id);
    }

}
