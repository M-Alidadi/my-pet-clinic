package guru.springframework.mypetclinic.services;

import guru.springframework.mypetclinic.model.Owner;

public interface OwnerServices extends CrudService<Owner, Long> {
    Owner findByName(String lastName);


}
