package guru.springframework.mypetclinic.services;

import guru.springframework.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerServices {
    Owner findByName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();


}