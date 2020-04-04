package pw.springdev.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pw.springdev.sfgpetclinic.model.Owner;

/**
 * Created by FedorD on 2020-04-04
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
