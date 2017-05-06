package com.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pet.model.Pet;
import com.pet.repository.PetRepository;


@RestController
@RequestMapping("/pet")
public class PetController {

	
	@Autowired
	Pet pet;
	@Autowired
	PetRepository petRepo;

    @RequestMapping(value="/addpet",method=RequestMethod.GET)
	public Pet create(@RequestParam String petName,@RequestParam String status)
	{
    	
    	pet.setPetName(petName);
    	pet.setStatus(status);
    	
    	
    	petRepo.save(pet);
    	
		return pet;
	}
    
    
    @RequestMapping(value="/updatePet",method=RequestMethod.PATCH)
	public Pet update()
	{
		return null;
	}
    
    
    @RequestMapping(value="/deletePet",method=RequestMethod.GET)
	public Pet deete()
	{
		return null;
	}
    
    @RequestMapping(value="/getPetById",method=RequestMethod.GET)
	public Pet read()
	{
		return null;
	}
    
    @RequestMapping(value="/getAllPets",method=RequestMethod.GET)
	public Pet readAll()
	{
		return null;
	}

    
    
    
    
}
