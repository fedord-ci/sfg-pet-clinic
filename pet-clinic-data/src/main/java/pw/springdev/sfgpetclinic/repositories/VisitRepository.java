package pw.springdev.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pw.springdev.sfgpetclinic.model.Visit;

/**
 * Created by FedorD on 2020-04-04
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
