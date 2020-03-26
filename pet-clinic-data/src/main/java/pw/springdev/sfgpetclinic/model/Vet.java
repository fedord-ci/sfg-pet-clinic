package pw.springdev.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-14
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
