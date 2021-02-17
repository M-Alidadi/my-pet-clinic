package model;

import java.time.LocalDate;

public class Pet {
    private model.PetType petType;
    private model.Owner owner;
    private LocalDate birthDate;

    public model.PetType getPetType() {
        return petType;
    }

    public void setPetType(model.PetType petType) {
        this.petType = petType;
    }

    public model.Owner getOwner() {
        return owner;
    }

    public void setOwner(model.Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
