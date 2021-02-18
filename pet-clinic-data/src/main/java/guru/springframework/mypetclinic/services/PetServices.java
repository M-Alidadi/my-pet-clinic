package guru.springframework.mypetclinic.services;

import guru.springframework.mypetclinic.model.Pet;

import java.util.Set;

public interface PetServices {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
