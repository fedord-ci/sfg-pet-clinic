package pw.springdev.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-14
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
