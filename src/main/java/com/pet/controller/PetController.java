package com.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pet.model.Pet;

@RestController
@RequestMapping("/pet")
public class PetController {

	

    @RequestMapping(value="/addpet",method=RequestMethod.POST)
	public Pet create()
	{
		return null;
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
