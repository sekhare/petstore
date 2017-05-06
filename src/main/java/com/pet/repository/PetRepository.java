package com.pet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pet.model.Pet;


@Repository
public interface PetRepository extends CrudRepository<Pet ,Long>{

}
