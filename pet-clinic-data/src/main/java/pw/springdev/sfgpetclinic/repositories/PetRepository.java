package pw.springdev.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pw.springdev.sfgpetclinic.model.Pet;

/**
 * Created by FedorD on 2020-04-04
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
