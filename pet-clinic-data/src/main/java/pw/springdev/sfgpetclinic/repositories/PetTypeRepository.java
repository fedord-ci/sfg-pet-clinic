package pw.springdev.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pw.springdev.sfgpetclinic.model.PetType;

/**
 * Created by FedorD on 2020-04-04
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
