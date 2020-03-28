package pw.springdev.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;
import pw.springdev.sfgpetclinic.model.PetType;
import pw.springdev.sfgpetclinic.service.PetTypeService;

/**
 * Created by FedorD on 2020-03-26
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long>
    implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
