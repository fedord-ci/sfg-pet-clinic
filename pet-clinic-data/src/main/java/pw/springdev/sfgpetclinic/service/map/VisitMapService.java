package pw.springdev.sfgpetclinic.service.map;

import pw.springdev.sfgpetclinic.model.Visit;
import pw.springdev.sfgpetclinic.service.VisitService;

import java.util.Set;

/**
 * Created by FedorD on 2020-04-05
 */
public class VisitMapService extends AbstractMapService<Visit, Long>
        implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        if (visit.getPet() == null || visit.getPet().getOwner() == null
                || visit.getPet().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }
}
