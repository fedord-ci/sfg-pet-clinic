package pw.springdev.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;
import pw.springdev.sfgpetclinic.model.Vet;
import pw.springdev.sfgpetclinic.service.VetService;

/**
 * Created by FedorD on 2020-03-23
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
    implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}