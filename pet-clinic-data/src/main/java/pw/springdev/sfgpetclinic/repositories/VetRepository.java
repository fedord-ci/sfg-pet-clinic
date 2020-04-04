package pw.springdev.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pw.springdev.sfgpetclinic.model.Vet;

/**
 * Created by FedorD on 2020-04-04
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
